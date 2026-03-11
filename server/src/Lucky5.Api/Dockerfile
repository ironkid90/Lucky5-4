FROM mcr.microsoft.com/dotnet/sdk:9.0 AS build
WORKDIR /src

COPY server/Lucky5.sln server/Lucky5.sln
COPY server/src/Lucky5.Api/Lucky5.Api.csproj server/src/Lucky5.Api/
COPY server/src/Lucky5.Application/Lucky5.Application.csproj server/src/Lucky5.Application/
COPY server/src/Lucky5.Domain/Lucky5.Domain.csproj server/src/Lucky5.Domain/
COPY server/src/Lucky5.Infrastructure/Lucky5.Infrastructure.csproj server/src/Lucky5.Infrastructure/
COPY server/src/Lucky5.Realtime/Lucky5.Realtime.csproj server/src/Lucky5.Realtime/
RUN dotnet restore server/src/Lucky5.Api/Lucky5.Api.csproj

COPY server/ server/
RUN dotnet publish server/src/Lucky5.Api/Lucky5.Api.csproj -c Release -o /app/publish

FROM mcr.microsoft.com/dotnet/aspnet:9.0 AS runtime
WORKDIR /app
COPY --from=build /app/publish .

ENV ASPNETCORE_URLS=http://+:8080
EXPOSE 8080

ENTRYPOINT ["dotnet", "Lucky5.Api.dll"]
