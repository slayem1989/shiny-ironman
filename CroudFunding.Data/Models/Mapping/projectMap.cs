using CroudFunding.Domain.Entities;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class projectMap : EntityTypeConfiguration<project>
    {
        public projectMap()
        {
            // Primary Key
            this.HasKey(t => t.idProject);

            // Properties
            this.Property(t => t.descripProject)
                .HasMaxLength(255);

            this.Property(t => t.nameProject)
                .HasMaxLength(255);

            this.Property(t => t.ownerProject)
                .HasMaxLength(255);

            this.Property(t => t.partnerProject)
                .HasMaxLength(255);

            this.Property(t => t.typeProject)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("projects", "collabdb");
            this.Property(t => t.idProject).HasColumnName("idProject");
            this.Property(t => t.dateProject).HasColumnName("dateProject");
            this.Property(t => t.descripProject).HasColumnName("descripProject");
            this.Property(t => t.moneyProject).HasColumnName("moneyProject");
            this.Property(t => t.nameProject).HasColumnName("nameProject");
            this.Property(t => t.ownerProject).HasColumnName("ownerProject");
            this.Property(t => t.partnerProject).HasColumnName("partnerProject");
            this.Property(t => t.typeProject).HasColumnName("typeProject");
            this.Property(t => t.projectFK).HasColumnName("projectFK");

            // Relationships
            this.HasOptional(t => t.user)
                .WithMany(t => t.projects)
                .HasForeignKey(d => d.projectFK);

        }
    }
}
