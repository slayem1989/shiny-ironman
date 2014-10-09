package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.*;

@Stateless
public class UserService implements UserServiceRemote{
	
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	public void create(User user) {
		em.persist(user);
	}

	public User findById(int id) {
		return em.find(User.class, id);
	}

	public void update(User user) {
		em.merge(user);
		
	}

	public void remove(User user) {
		em.remove(em.merge(user));		
	}

	public void removeById(int id) {
		em.remove(em.find(User.class, id));		
	}

	public List<User> findAll() {
		return em.createQuery("select u from User u",User.class).getResultList();
	}

}
