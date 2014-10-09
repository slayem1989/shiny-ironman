package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Investor;


@Stateless
public class InvestorService implements InvestorServiceRemote {
	
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	@Override
	public void create(Investor investor) {
		em.persist(investor);
		
	}

	@Override
	public Investor findById(int id) {
		return em.find(Investor.class, id);
	}

	@Override
	public void update(Investor investor) {
		em.merge(investor);
	}

	@Override
	public void remove(Investor investor) {
		em.remove(em.merge(investor));		
	}

	@Override
	public void removeById(int id) {
		em.remove(em.find(Investor.class, id));
		
	}

	@Override
	public List<Investor> findAll() {
		return em.createQuery("select i from Investor i",Investor.class).getResultList();
	}

}
