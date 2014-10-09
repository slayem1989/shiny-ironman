package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface AdminServiceRemote {

	void create(Administrator admin);
	Administrator findById(int id);
	void update(Administrator admin);
	void remove(Administrator admin);
	void removeById(int id);
	List<Administrator> findAll();
}
