package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface ProjectServiceRemote {
	
	void create(Projects project);
	Projects findById(int id);
	void update(Projects project);
	void remove(Projects project);
	void removeById(int id);
	List<Projects> findAll();
	Projects ResearchByName(String NameP);
}
