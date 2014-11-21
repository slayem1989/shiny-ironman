using System;
using System.Collections.Generic;

namespace CroudFunding.Data.Models
{
    public partial class project
    {
        public int idProject { get; set; }
        public Nullable<System.DateTime> dateProject { get; set; }
        public string descripProject { get; set; }
        public int moneyProject { get; set; }
        public string nameProject { get; set; }
        public string ownerProject { get; set; }
        public string partnerProject { get; set; }
        public string typeProject { get; set; }
        public Nullable<int> projectFK { get; set; }
        public virtual user user { get; set; }
    }
}
