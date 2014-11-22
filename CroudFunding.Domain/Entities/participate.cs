using System;
using System.Collections.Generic;

namespace CroudFunding.Domain.Entities
{
    public partial class participate
    {
        public int idUser { get; set; }
        public int idchallenge { get; set; }
        public string solution { get; set; }
    }
}
