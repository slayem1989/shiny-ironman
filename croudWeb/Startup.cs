using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(croudWeb.Startup))]
namespace croudWeb
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
