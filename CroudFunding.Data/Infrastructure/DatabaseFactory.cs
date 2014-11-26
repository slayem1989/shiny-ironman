using CroudFunding.Data.Infrastructure;
using CroudFunding.Data.Models;
using System;

namespace CroudFunding.Data.Infrastructure
{
    public class DatabaseFactory : Disposable, IDatabaseFactory
    {
        private collabdbContext dataContext = null;

        public collabdbContext Get()
        {
            return dataContext ?? (dataContext = new collabdbContext());
        }
        protected override void DisposeCore()
        {
            if (dataContext != null)
                dataContext.Dispose();
        }


    }
}