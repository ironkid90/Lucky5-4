using Lucky5.Application.Contracts;
using Lucky5.Domain.Entities;
using Lucky5.Domain.Game;
using Lucky5.Infrastructure.Services;
using Lucky5.Application.Requests;
using Microsoft.Extensions.Configuration;

var failures = new List<string>();

void Assert(bool condition, string message)
{
    if (!condition)
    {
        failures.Add(message);
    }
}

var royalFlush = new List<PokerCard>
{
    new("10", "H"),
    new("J", "H"),
    new("Q", "H"),
    new("K", "H"),
    new("A", "H")
};

var twoPair = new List<PokerCard>
{
    new("A", "S"),
    new("A", "D"),
    new("8", "C"),
    new("8", "H"),
    new("2", "S")
};

var noWin = new List<PokerCard>
{
    new("2", "S"),
    new("4", "D"),
    new("6", "C"),
    new("8", "H"),
    new("10", "S")
};

var rf = PokerHandEvaluator.Evaluate(royalFlush);
Assert(rf.Rank == "RoyalFlush" && rf.Multiplier == 250m, "Royal flush payout mismatch");

var tp = PokerHandEvaluator.Evaluate(twoPair);
Assert(tp.Rank == "TwoPair" && tp.Multiplier == 2m, "Two pair payout mismatch");

var nw = PokerHandEvaluator.Evaluate(noWin);
Assert(nw.Rank == "NoWin" && nw.Multiplier == 0m, "NoWin payout mismatch");

var configuration = new ConfigurationBuilder()
    .AddInMemoryCollection(new Dictionary<string, string?> { ["JWT:SIGNING_KEY"] = "test-signing-key" })
    .Build();

var store = new InMemoryDataStore();
var tokenService = new SimpleTokenService(configuration);
var authService = new AuthService(store, tokenService);
var gameService = new GameService(store, new DefaultEntropyGenerator());

var profile = await authService.SignupAsync(new SignupRequest("tester", "password", "+9610000000"), CancellationToken.None);
Assert(profile.Username == "tester", "Signup should return created profile");

var otpVerified = await authService.VerifyOtpAsync(new VerifyOtpRequest("tester", "123456"), CancellationToken.None);
Assert(otpVerified, "OTP should verify using bootstrap code");

var login = await authService.LoginAsync(new LoginRequest("tester", "password"), CancellationToken.None);
Assert(login.Tokens.AccessToken.Length > 10, "Login should issue access token");

var machine = (await gameService.GetMachinesAsync(CancellationToken.None)).First();
var beforeDeal = login.Profile.WalletBalance;
var deal = await gameService.DealAsync(profile.UserId, new DealRequest(machine.Id, machine.MinBet), CancellationToken.None);
Assert(deal.Cards.Count == 5, "Deal should return 5 cards");
Assert(deal.WalletBalanceAfterBet == beforeDeal - machine.MinBet, "Deal should debit wallet");

var draw = await gameService.DrawAsync(profile.UserId, new DrawRequest(deal.RoundId, [0, 1, 2, 3, 4]), CancellationToken.None);
Assert(draw.Cards.Count == 5, "Draw should return 5 cards");
Assert(draw.WalletBalanceAfterRound >= deal.WalletBalanceAfterBet, "Draw should not reduce wallet below post-bet balance");

var history = await authService.GetMemberHistoryAsync(profile.UserId, CancellationToken.None);
Assert(history.Count >= 1, "Wallet history should contain at least bet entry");
Assert(store.MachineLedgers[machine.Id].CapitalIn >= machine.MinBet, "Machine ledger should track capital-in after deal");

var uniqueOpeningHands = new HashSet<string>(StringComparer.Ordinal);
for (var i = 0; i < 12; i++)
{
    var rDeal = await gameService.DealAsync(profile.UserId, new DealRequest(machine.Id, machine.MinBet), CancellationToken.None);
    uniqueOpeningHands.Add(string.Join(",", rDeal.Cards.Select(c => c.Code)));
    await gameService.DrawAsync(profile.UserId, new DrawRequest(rDeal.RoundId, []), CancellationToken.None);
}

Assert(uniqueOpeningHands.Count >= 4, "Card distribution should produce diverse openings under entropy/noise model");

var modeState = await gameService.GetMachineStateAsync(machine.Id, CancellationToken.None);
Assert(modeState is not null, "Machine state should be available");

// Deterministic Replay Tests
await Lucky5.Tests.ReplayTests.RunAsync(failures);
await Lucky5.Tests.CleanRoomEngineTests.RunAsync(failures);

if (draw.WinAmount > 0)
{
    var result = await gameService.DoubleUpAsync(profile.UserId, new DoubleUpRequest(draw.RoundId, "big"), CancellationToken.None);
    Assert(result.Status is "Won" or "Lost", "Double-up should resolve to Won or Lost when there is a prior win");
}

if (failures.Count > 0)
{
    Console.Error.WriteLine("Lucky5 bootstrap tests failed:");
    foreach (var failure in failures)
    {
        Console.Error.WriteLine($"- {failure}");
    }

    Environment.Exit(1);
}

Console.WriteLine("Lucky5 bootstrap tests passed.");
