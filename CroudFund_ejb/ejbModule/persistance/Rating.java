package persistance;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Rating implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RatingPk ratingPk;
	private User user;
	private Projects projects;
	
	

	@EmbeddedId
	public RatingPk getRatingPk() {
		return ratingPk;
	}

	public void setRatingPk(RatingPk ratingPk) {
		this.ratingPk = ratingPk;
	}

	@ManyToOne
	@JoinColumn(insertable = false ,updatable = false , name = "idUser" ,referencedColumnName = "idUser")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(insertable = false,updatable = false , name = "idProject",referencedColumnName = "idProject")
	public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String toString() {
		return "Rating [ratingPk=" + ratingPk + ", user=" + user
				+ ", projects=" + projects + "]";
	}
	
	
	
	

	
}
