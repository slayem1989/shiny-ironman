using CroudFunding.Domain.Entities;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class commentMap : EntityTypeConfiguration<comment>
    {
        public commentMap()
        {
            // Primary Key
            this.HasKey(t => new { t.idProject, t.idUser });

            // Properties
            this.Property(t => t.idProject)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.idUser)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.contents)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("comment", "collabdb");
            this.Property(t => t.idProject).HasColumnName("idProject");
            this.Property(t => t.idUser).HasColumnName("idUser");
            this.Property(t => t.contents).HasColumnName("contents");
            this.Property(t => t.dateComment).HasColumnName("dateComment");
            this.Property(t => t.timeComment).HasColumnName("timeComment");
        }
    }
}
