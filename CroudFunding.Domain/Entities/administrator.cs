using System;
using System.Collections.Generic;

namespace CroudFunding.Domain.Entities
{
    public partial class administrator
    {
        public int idAdmin { get; set; }
        public string loginAdmin { get; set; }
        public string passwordAdmin { get; set; }
    }
}
