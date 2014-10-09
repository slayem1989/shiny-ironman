package Service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import persistance.Administrator;

import services.AdminServiceRemote;

public class CreateAdminservice {
	public static void main(String[] args) {
		AdminServiceRemote proxy = null;
		Context context = null;
		
		try {
			context = new InitialContext();
			proxy = (AdminServiceRemote) context.lookup("ejb:/CroudFund_ejb/AdminService!services.AdminServiceRemote");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		Administrator administrator = new Administrator();
		administrator.setLoginAdmin("Manou");
		administrator.setPasswordAdmin("Manou");
		proxy.create(administrator);
		System.out.println(administrator);
		
	
	}

}
