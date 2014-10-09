package persistance;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DonationPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idInvestor;
	private int idProject;
	
	public int getIdInvestor() {
		return idInvestor;
	}
	public void setIdInvestor(int idInvestor) {
		this.idInvestor = idInvestor;
	}
	public int getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idInvestor;
		result = prime * result + idProject;
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
		DonationPk other = (DonationPk) obj;
		if (idInvestor != other.idInvestor)
			return false;
		if (idProject != other.idProject)
			return false;
		return true;
	}
	
	

}
