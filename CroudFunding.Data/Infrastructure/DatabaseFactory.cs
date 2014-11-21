using CroudFunding.Data.Infrastructure;
using CroudFunding.Data.Models;
using System;
public class DatabaseFactory : Disposable, IDatabaseFactory{
	private collabdbContext dataContext; 
    public collabdbContext DataContext 
    {
        get { return dataContext; }
    }
    public DatabaseFactory()
    {
        dataContext = new collabdbContext();
    }
	protected override void DisposeCore() {
		if (dataContext != null) dataContext.Dispose(); }

    public collabdbContext Get()
    {
        throw new NotImplementedException();
    }

    collabdbContext IDatabaseFactory.DataContext
    {
        get
        {
            throw new NotImplementedException();
        }
        set
        {
            throw new NotImplementedException();
        }
    }
}