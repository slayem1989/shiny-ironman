using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.ModelConfiguration;

namespace CroudFunding.Data.Models.Mapping
{
    public class userMap : EntityTypeConfiguration<user>
    {
        public userMap()
        {
            // Primary Key
            this.HasKey(t => t.idUser);

            // Properties
            this.Property(t => t.currentLocationUser)
                .HasMaxLength(255);

            this.Property(t => t.firstNameUser)
                .HasMaxLength(255);

            this.Property(t => t.genderUser)
                .HasMaxLength(255);

            this.Property(t => t.jobsUser)
                .HasMaxLength(255);

            this.Property(t => t.languagesUser)
                .HasMaxLength(255);

            this.Property(t => t.lastNameUser)
                .HasMaxLength(255);

            this.Property(t => t.mailUser)
                .HasMaxLength(255);

            // Table & Column Mappings
            this.ToTable("user", "collabdb");
            this.Property(t => t.idUser).HasColumnName("idUser");
            this.Property(t => t.ageUser).HasColumnName("ageUser");
            this.Property(t => t.birthdayUser).HasColumnName("birthdayUser");
            this.Property(t => t.currentLocationUser).HasColumnName("currentLocationUser");
            this.Property(t => t.firstNameUser).HasColumnName("firstNameUser");
            this.Property(t => t.genderUser).HasColumnName("genderUser");
            this.Property(t => t.jobsUser).HasColumnName("jobsUser");
            this.Property(t => t.languagesUser).HasColumnName("languagesUser");
            this.Property(t => t.lastNameUser).HasColumnName("lastNameUser");
            this.Property(t => t.mailUser).HasColumnName("mailUser");
            this.Property(t => t.phoneUser).HasColumnName("phoneUser");
            this.Property(t => t.pictureUser).HasColumnName("pictureUser");
        }
    }
}
