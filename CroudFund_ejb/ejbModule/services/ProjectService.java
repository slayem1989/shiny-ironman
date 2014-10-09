package services;

import java.util.List;
import java.util.logging.Level;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.sun.istack.internal.logging.Logger;

import persistance.*;

@Stateless
public class ProjectService implements ProjectServiceRemote {
	
	@PersistenceContext(unitName = "CroudFund_ejb")
	private EntityManager em ;

	public void create(Projects project) {
		em.persist(project);
	}

	public Projects findById(int id) {
		return em.find(Projects.class, id);
	}

	public void update(Projects project) {
		em.merge(project);
		
	}

	public void remove(Projects project) {
		em.remove(em.merge(project));
	}

	public void removeById(int id) {
		em.remove(em.find(Projects.class, id));
	}

	public List<Projects> findAll() {
		return em.createQuery("select p from Projects p",Projects.class).getResultList();
		
	}
	//Research Projects By Name 

	public Projects ResearchByName(String NameP) {
		Projects found = null;
		String jpql = "select p from Projects p where p.nameProject=:x";
		TypedQuery<Projects> query = em.createNamedQuery(jpql,Projects.class);
		query.setParameter("x", NameP);
		try {
			found = query.getSingleResult();
		} catch (Exception e) {
			Logger.getLogger(this.getClass()).log(Level.WARNING,"Erreur = "+NameP+"");
			
		}
			return found;
			
		}
	}
	
	
	
	
	
	
	

