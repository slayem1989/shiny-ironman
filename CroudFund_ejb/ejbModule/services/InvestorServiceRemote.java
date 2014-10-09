package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.*;

@Remote
public interface InvestorServiceRemote {

	void create(Investor investor);
	Investor findById(int id);
	void update(Investor investor);
	void remove(Investor investor);
	void removeById(int id);
	List<Investor> findAll();
	
}
