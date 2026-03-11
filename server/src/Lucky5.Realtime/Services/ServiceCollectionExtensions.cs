namespace Lucky5.Realtime.Services;

using Microsoft.Extensions.DependencyInjection;

public static class ServiceCollectionExtensions
{
    public static IServiceCollection AddLucky5Realtime(this IServiceCollection services)
    {
        services.AddSingleton<ConnectionRegistry>();
        services.AddHostedService<HeartbeatMonitorService>();
        return services;
    }
}
