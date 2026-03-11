using Microsoft.AspNetCore.Mvc;
using System.Threading.Tasks;

namespace Lucky5.Server.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class GameController : ControllerBase
    {
        [HttpGet("games")]
        public async Task<IActionResult> GetGames()
        {
            // TODO: Implement logic to get games
            return Ok(new { games = new[] { "Game 1", "Game 2" } });
        }

        [HttpGet("games/machines")]
        public async Task<IActionResult> GetGameMachines()
        {
            // TODO: Implement logic to get game machines
            return Ok(new { machines = new[] { "Machine 1", "Machine 2" } });
        }

        [HttpGet("cards")]
        public async Task<IActionResult> GetCards()
        {
            // TODO: Implement logic to get cards
            return Ok(new { cards = "..." });
        }

        [HttpGet("defaultRules")]
        public async Task<IActionResult> GetDefaultRules()
        {
            // TODO: Implement logic to get default rules
            return Ok(new { rules = "..." });
        }

        [HttpGet("offer")]
        public async Task<IActionResult> GetOffer()
        {
            // TODO: Implement logic to get offer
            return Ok(new { offer = "..." });
        }
    }
}
