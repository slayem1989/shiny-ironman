using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class donationMap : EntityTypeConfiguration<donation>
    {
        public donationMap()
        {
            // Primary Key
            this.HasKey(t => new { t.idInvestor, t.idProject });

            // Properties
            this.Property(t => t.idInvestor)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            this.Property(t => t.idProject)
                .HasDatabaseGeneratedOption(DatabaseGeneratedOption.None);

            // Table & Column Mappings
            this.ToTable("donation", "collabdb");
            this.Property(t => t.idInvestor).HasColumnName("idInvestor");
            this.Property(t => t.idProject).HasColumnName("idProject");
            this.Property(t => t.dateDonation).HasColumnName("dateDonation");
            this.Property(t => t.idDonation).HasColumnName("idDonation");
            this.Property(t => t.sumDonation).HasColumnName("sumDonation");
        }
    }
}
