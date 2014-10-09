package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface ChallengeServiceRemote {

	void create(Challenge challenge);
	Challenge findById(int id);
	void update(Challenge challenge);
	void remove(Challenge challenge);
	void removeById(int id);
	List<Challenge> findAll();
}
