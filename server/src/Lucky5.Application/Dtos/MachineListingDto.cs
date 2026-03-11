namespace Lucky5.Application.Dtos;

public sealed record MachineListingDto(int Id, string Name, bool IsOpen, decimal MinBet, decimal MaxBet);
