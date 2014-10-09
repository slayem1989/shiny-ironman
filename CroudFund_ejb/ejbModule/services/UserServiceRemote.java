package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface UserServiceRemote {

	void create(User user);
	User findById(int id);
	void update(User user);
	void remove(User user);
	void removeById(int id);
	List<User> findAll();
}
