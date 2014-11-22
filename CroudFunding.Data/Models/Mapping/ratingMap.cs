using CroudFunding.Domain.Entities;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class ratingMap : EntityTypeConfiguration<rating>
    {
        public ratingMap()
        {
            // Primary Key
            this.HasKey(t => new { t.idProjectPf, t.idUserPk });

            // Properties
            this.Property(t => t.idProjectPf)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.idUserPk)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            // Table & Column Mappings
            this.ToTable("rating", "collabdb");
            this.Property(t => t.idProjectPf).HasColumnName("idProjectPf");
            this.Property(t => t.idUserPk).HasColumnName("idUserPk");
        }
    }
}
