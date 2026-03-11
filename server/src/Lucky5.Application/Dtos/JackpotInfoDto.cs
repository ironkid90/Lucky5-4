namespace Lucky5.Application.Dtos;

public sealed record JackpotInfoDto(
    decimal FullHouse,
    int FullHouseRank,
    decimal FourOfAKindA,
    decimal FourOfAKindB,
    int ActiveFourOfAKindSlot,
    decimal StraightFlush);
