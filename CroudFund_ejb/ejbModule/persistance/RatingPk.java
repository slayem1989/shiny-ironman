package persistance;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RatingPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idUser ;
	private int idProject;
	
	
	public int getIdUserPk() {
		return idUser;
	}
	public void setIdUserPk(int idUserPk) {
		this.idUser = idUserPk;
	}
	public int getIdProjectPf() {
		return idProject;
	}
	public void setIdProjectPf(int idProjectPf) {
		this.idProject = idProjectPf;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProject;
		result = prime * result + idUser;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingPk other = (RatingPk) obj;
		if (idProject != other.idProject)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
	
	
	
	
}
