using CroudFunding.Domain.Entities;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class forumMap : EntityTypeConfiguration<forum>
    {
        public forumMap()
        {
            // Primary Key
            this.HasKey(t => t.idForum);

            // Properties
            this.Property(t => t.nomForum)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("forum", "collabdb");
            this.Property(t => t.idForum).HasColumnName("idForum");
            this.Property(t => t.nomForum).HasColumnName("nomForum");
        }
    }
}
