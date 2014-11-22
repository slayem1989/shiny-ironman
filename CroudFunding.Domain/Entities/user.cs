using System;
using System.Collections.Generic;

namespace CroudFunding.Domain.Entities
{
    public partial class user
    {
        public user()
        {
            this.projects = new List<project>();
        }

        public int idUser { get; set; }
        public int ageUser { get; set; }
        public Nullable<System.DateTime> birthdayUser { get; set; }
        public string currentLocationUser { get; set; }
        public string firstNameUser { get; set; }
        public string genderUser { get; set; }
        public string jobsUser { get; set; }
        public string languagesUser { get; set; }
        public string lastNameUser { get; set; }
        public string mailUser { get; set; }
        public int phoneUser { get; set; }
        public byte[] pictureUser { get; set; }
        public virtual ICollection<project> projects { get; set; }
    }
}
