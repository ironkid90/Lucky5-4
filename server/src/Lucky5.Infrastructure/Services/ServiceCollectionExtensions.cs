namespace Lucky5.Infrastructure.Services;

using Lucky5.Application.Contracts;
using Microsoft.Extensions.DependencyInjection;

public static class ServiceCollectionExtensions
{
    public static IServiceCollection AddLucky5Infrastructure(this IServiceCollection services)
    {
        services.AddSingleton<InMemoryDataStore>();
        services.AddSingleton<ITokenService, SimpleTokenService>();
        services.AddSingleton<IEntropyGenerator, DefaultEntropyGenerator>();
        services.AddSingleton<IAuthService, AuthService>();
        services.AddSingleton<IGameService, GameService>();
        services.AddSingleton<IGeneralService, GeneralService>();
        return services;
    }
}
