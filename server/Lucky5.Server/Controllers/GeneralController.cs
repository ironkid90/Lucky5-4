using Microsoft.AspNetCore.Mvc;
using System.Threading.Tasks;

namespace Lucky5.Server.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class GeneralController : ControllerBase
    {
        [HttpGet("app-settings")]
        public async Task<IActionResult> GetAppSettings()
        {
            // TODO: Implement logic to get app settings
            return Ok(new { settings = "..." });
        }

        [HttpGet("contact-info")]
        public async Task<IActionResult> GetContactInfo()
        {
            // TODO: Implement logic to get contact info
            return Ok(new { info = "..." });
        }

        [HttpGet("contact-types")]
        public async Task<IActionResult> GetContactTypes()
        {
            // TODO: Implement logic to get contact types
            return Ok(new { types = "..." });
        }
    }
}
