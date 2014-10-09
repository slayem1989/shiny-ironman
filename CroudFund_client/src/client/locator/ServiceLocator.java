package client.locator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
	
	private static ServiceLocator instance;
	private Map<String, Object> cache;
	private Context ctx= null;
	
	public ServiceLocator() {
		
		cache = new HashMap<String, Object>();
		try {
			ctx=new InitialContext();
		} catch (NamingException e) {
			throw new ServiceLocatorException(e);
		}
		
	}

	public synchronized static ServiceLocator getInstance() {
		if(instance == null){
			instance = new ServiceLocator();
		}
		return instance;
	}
	
	public synchronized Object getProxy(String jndiName) {
		Object proxy= cache.get(jndiName);
		if(proxy == null)
			try {
				proxy = ctx.lookup(jndiName);
			} catch (NamingException e) {
				throw new ServiceLocatorException(e);
			}
		cache.put(jndiName, proxy);
		return proxy;
		
	}
	

}
