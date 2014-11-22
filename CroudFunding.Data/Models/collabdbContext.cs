using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using CroudFunding.Data.Models.Mapping;
using CroudFunding.Domain.Entities;

namespace CroudFunding.Data.Models
{
    public partial class collabdbContext : DbContext
    {
        static collabdbContext()
        {
            Database.SetInitializer<collabdbContext>(null);
        }

        public collabdbContext()
            : base("Name=collabdbContext")
        {
        }

        public DbSet<administrator> administrators { get; set; }
        public DbSet<challenge> challenges { get; set; }
        public DbSet<comment> comments { get; set; }
        public DbSet<donation> donations { get; set; }
        public DbSet<forum> fora { get; set; }
        public DbSet<investor> investors { get; set; }
        public DbSet<participate> participates { get; set; }
        public DbSet<project> projects { get; set; }
        public DbSet<rating> ratings { get; set; }
        public DbSet<user> users { get; set; }
        public DbSet<winner> winners { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Configurations.Add(new administratorMap());
            modelBuilder.Configurations.Add(new challengeMap());
            modelBuilder.Configurations.Add(new commentMap());
            modelBuilder.Configurations.Add(new donationMap());
            modelBuilder.Configurations.Add(new forumMap());
            modelBuilder.Configurations.Add(new investorMap());
            modelBuilder.Configurations.Add(new participateMap());
            modelBuilder.Configurations.Add(new projectMap());
            modelBuilder.Configurations.Add(new ratingMap());
            modelBuilder.Configurations.Add(new userMap());
            modelBuilder.Configurations.Add(new winnerMap());
        }
    }
}
