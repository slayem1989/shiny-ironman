using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class challengeMap : EntityTypeConfiguration<challenge>
    {
        public challengeMap()
        {
            // Primary Key
            this.HasKey(t => t.idChallenge);

            // Properties
            this.Property(t => t.nameChallenge)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("challenge", "collabdb");
            this.Property(t => t.idChallenge).HasColumnName("idChallenge");
            this.Property(t => t.dateBegin).HasColumnName("dateBegin");
            this.Property(t => t.datefinish).HasColumnName("datefinish");
            this.Property(t => t.nameChallenge).HasColumnName("nameChallenge");
        }
    }
}
