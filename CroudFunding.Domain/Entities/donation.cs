using System;
using System.Collections.Generic;

namespace CroudFunding.Data.Models
{
    public partial class donation
    {
        public int idInvestor { get; set; }
        public int idProject { get; set; }
        public Nullable<System.DateTime> dateDonation { get; set; }
        public int idDonation { get; set; }
        public Nullable<float> sumDonation { get; set; }
    }
}
