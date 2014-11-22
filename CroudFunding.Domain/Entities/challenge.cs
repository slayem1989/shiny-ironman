using System;
using System.Collections.Generic;

namespace CroudFunding.Domain.Entities
{
    public partial class challenge
    {
        public int idChallenge { get; set; }
        public Nullable<System.DateTime> dateBegin { get; set; }
        public Nullable<System.DateTime> datefinish { get; set; }
        public string nameChallenge { get; set; }
    }
}
