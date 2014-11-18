using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class winnerMap : EntityTypeConfiguration<winner>
    {
        public winnerMap()
        {
            // Primary Key
            this.HasKey(t => t.idWinner);

            // Properties
            this.Property(t => t.awardWinner)
                .HasMaxLength(255);

            this.Property(t => t.nameWinner)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("winner", "collabdb");
            this.Property(t => t.idWinner).HasColumnName("idWinner");
            this.Property(t => t.awardWinner).HasColumnName("awardWinner");
            this.Property(t => t.nameWinner).HasColumnName("nameWinner");
        }
    }
}
