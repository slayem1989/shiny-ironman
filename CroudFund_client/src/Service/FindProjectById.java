package Service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistance.Projects;

import services.ProjectServiceRemote;

public class FindProjectById {
	public static void main(String[] args) {
		ProjectServiceRemote proxy = null;
		Context ctx = null;
		try {
			ctx = new InitialContext();
			proxy = (ProjectServiceRemote) ctx.lookup("ejb:/CroudFund_ejb/ProjectService!services.ProjectServiceRemote");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		Projects projetFound = proxy.findById(3);
		System.out.println(projetFound);
	}

}
