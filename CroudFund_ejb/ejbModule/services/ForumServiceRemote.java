package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface ForumServiceRemote {

	void create(Forum forum);
	Forum findById(int id);
	void update(Forum forum);
	void remove(Forum forum);
	void removeById(int id);
	List<Forum> findAll();
}
