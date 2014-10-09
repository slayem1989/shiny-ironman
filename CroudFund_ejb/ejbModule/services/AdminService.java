package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Administrator;
import persistance.Projects;


@Stateless
public class AdminService implements AdminServiceRemote {
	
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	public void create(Administrator admin) {
		em.persist(admin);
	}

	public Administrator findById(int id) {
		return em.find(Administrator.class, id);
	}

	public void update(Administrator admin) {
		em.merge(admin);
	}

	public void remove(Administrator admin) {
		em.remove(em.merge(admin));
	}

	public void removeById(int id) {
		em.remove(em.find(Administrator.class, id));
	}

	public List<Administrator> findAll() {
		return em.createQuery("select a from Administrator a",Administrator.class).getResultList();
	}

}
