using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class investorMap : EntityTypeConfiguration<investor>
    {
        public investorMap()
        {
            // Primary Key
            this.HasKey(t => t.idInvestor);

            // Properties
            this.Property(t => t.currentLocationInvestor)
                .HasMaxLength(255);

            this.Property(t => t.firstNameInvestor)
                .HasMaxLength(255);

            this.Property(t => t.genderInvestor)
                .HasMaxLength(255);

            this.Property(t => t.jobsInvestor)
                .HasMaxLength(255);

            this.Property(t => t.languagesInvestor)
                .HasMaxLength(255);

            this.Property(t => t.lastNameInvestor)
                .HasMaxLength(255);

            this.Property(t => t.mailInvestor)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("investor", "collabdb");
            this.Property(t => t.idInvestor).HasColumnName("idInvestor");
            this.Property(t => t.ageInvestor).HasColumnName("ageInvestor");
            this.Property(t => t.birthdayInvestor).HasColumnName("birthdayInvestor");
            this.Property(t => t.currentLocationInvestor).HasColumnName("currentLocationInvestor");
            this.Property(t => t.firstNameInvestor).HasColumnName("firstNameInvestor");
            this.Property(t => t.genderInvestor).HasColumnName("genderInvestor");
            this.Property(t => t.jobsInvestor).HasColumnName("jobsInvestor");
            this.Property(t => t.languagesInvestor).HasColumnName("languagesInvestor");
            this.Property(t => t.lastNameInvestor).HasColumnName("lastNameInvestor");
            this.Property(t => t.mailInvestor).HasColumnName("mailInvestor");
            this.Property(t => t.phoneInvestor).HasColumnName("phoneInvestor");
            this.Property(t => t.pictureInvestor).HasColumnName("pictureInvestor");
        }
    }
}
