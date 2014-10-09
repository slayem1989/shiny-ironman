package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.*;

@Stateless
public class ChallengeService implements ChallengeServiceRemote {
	
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	@Override
	public void create(Challenge challenge) {
		em.persist(challenge);
		
	}

	@Override
	public Challenge findById(int id) {
		return em.find(Challenge.class, id);
	}

	public void update(Challenge challenge) {
		em.merge(challenge);
	}

	public void remove(Challenge challenge) {
		em.remove(em.merge(challenge));
	}

	public void removeById(int id) {
		em.remove(em.find(Challenge.class, id));		
	}

	public List<Challenge> findAll() {
		return em.createQuery("select c from Challenge c",Challenge.class).getResultList();
	}

}
