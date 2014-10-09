package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Forum;

@Stateless
public class ForumService implements ForumServiceRemote {
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	@Override
	public void create(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Forum findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Forum> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
