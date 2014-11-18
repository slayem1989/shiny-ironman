using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class administratorMap : EntityTypeConfiguration<administrator>
    {
        public administratorMap()
        {
            // Primary Key
            this.HasKey(t => t.idAdmin);

            // Properties
            this.Property(t => t.loginAdmin)
                .HasMaxLength(255);

            this.Property(t => t.passwordAdmin)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("administrator", "collabdb");
            this.Property(t => t.idAdmin).HasColumnName("idAdmin");
            this.Property(t => t.loginAdmin).HasColumnName("loginAdmin");
            this.Property(t => t.passwordAdmin).HasColumnName("passwordAdmin");
        }
    }
}
