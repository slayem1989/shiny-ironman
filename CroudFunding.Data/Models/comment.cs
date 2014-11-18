using System;
using System.Collections.Generic;

namespace CroudFunding.Data.Models
{
    public partial class comment
    {
        public int idProject { get; set; }
        public int idUser { get; set; }
        public string contents { get; set; }
        public Nullable<System.DateTime> dateComment { get; set; }
        public Nullable<System.TimeSpan> timeComment { get; set; }
    }
}
