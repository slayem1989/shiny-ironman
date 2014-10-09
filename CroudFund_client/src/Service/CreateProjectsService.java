package Service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Date;

import persistance.Projects;

import services.ProjectServiceRemote;


public class CreateProjectsService {
	
	
	public static void main(String[] args) {
		ProjectServiceRemote proxy = null;
		Context context = null;
		try {
			context = new InitialContext();
			proxy = (ProjectServiceRemote) context.lookup("ejb:/CroudFund_ejb/ProjectService!services.ProjectServiceRemote");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		Projects projects = new Projects();
		projects.setNameProject("Test");
		projects.setDescripProject("Test");
		projects.setDateProject(java.sql.Date.valueOf("2023-07-08"));
		projects.setMoneyProject(600);
		projects.setOwnerProject("Test");
		projects.setPartnerProject("Test");
		projects.setTypeProject("Test");
		proxy.create(projects);
		
		
	}
	

}
