package Service;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistance.Projects;

import java.util.List;

import services.ProjectServiceRemote;

public class TestFindAllProjects {
	public static void main(String[] args) {
		ProjectServiceRemote proxy = null;
		Context context = null;
		try {
			context = new InitialContext();
			proxy = (ProjectServiceRemote) context.lookup("ejb:/CroudFund_ejb/ProjectService!services.ProjectServiceRemote");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		
	
		List<Projects> found = proxy.findAll();
		for (Projects p:found){
		System.out.println(found);
		}
		
		}
	}
	
	


