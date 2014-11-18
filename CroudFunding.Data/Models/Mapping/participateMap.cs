using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class participateMap : EntityTypeConfiguration<participate>
    {
        public participateMap()
        {
            // Primary Key
            this.HasKey(t => new { t.idUser, t.idchallenge });

            // Properties
            this.Property(t => t.idUser)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.idchallenge)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.solution)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("participate", "collabdb");
            this.Property(t => t.idUser).HasColumnName("idUser");
            this.Property(t => t.idchallenge).HasColumnName("idchallenge");
            this.Property(t => t.solution).HasColumnName("solution");
        }
    }
}
