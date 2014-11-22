using System;
using System.Collections.Generic;

namespace CroudFunding.Domain.Entities
{
    public partial class investor
    {
        public int idInvestor { get; set; }
        public int ageInvestor { get; set; }
        public Nullable<System.DateTime> birthdayInvestor { get; set; }
        public string currentLocationInvestor { get; set; }
        public string firstNameInvestor { get; set; }
        public string genderInvestor { get; set; }
        public string jobsInvestor { get; set; }
        public string languagesInvestor { get; set; }
        public string lastNameInvestor { get; set; }
        public string mailInvestor { get; set; }
        public int phoneInvestor { get; set; }
        public byte[] pictureInvestor { get; set; }
    }
}
