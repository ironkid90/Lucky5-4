namespace Lucky5.Domain.Entities;

public sealed class Machine
{
    public int Id { get; init; }
    public string Name { get; init; } = string.Empty;
    public bool IsOpen { get; set; } = true;
    public decimal MinBet { get; init; } = 1;
    public decimal MaxBet { get; init; } = 10;
}
