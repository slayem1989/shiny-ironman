package persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Projects implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idProject;
	private String nameProject;
	private String typeProject;
	private String descripProject;
	private Date dateProject;
	private int moneyProject;
	private String partnerProject;
	private String ownerProject;
	private List<Investor> listInverstors;
	private List<Rating> ratingsList;
	private List<Comment> comments;
	private List<Donation> donations;

	public Projects() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public String getTypeProject() {
		return typeProject;
	}

	public void setTypeProject(String typeProject) {
		this.typeProject = typeProject;
	}

	public String getDescripProject() {
		return descripProject;
	}

	public void setDescripProject(String descripProject) {
		this.descripProject = descripProject;
	}

	public Date getDateProject() {
		return dateProject;
	}

	public void setDateProject(Date dateProject) {
		this.dateProject = dateProject;
	}

	public int getMoneyProject() {
		return moneyProject;
	}

	public void setMoneyProject(int moneyProject) {
		this.moneyProject = moneyProject;
	}

	public String getPartnerProject() {
		return partnerProject;
	}

	public void setPartnerProject(String partnerProject) {
		this.partnerProject = partnerProject;
	}

	public String getOwnerProject() {
		return ownerProject;
	}

	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}

	@ManyToMany
	public List<Investor> getListInverstors() {
		return listInverstors;
	}

	public void setListInverstors(List<Investor> listInverstors) {
		this.listInverstors = listInverstors;
	}

	@OneToMany(mappedBy = "projects")
	public List<Rating> getRatingsList() {
		return ratingsList;
	}

	public void setRatingsList(List<Rating> ratingsList) {
		this.ratingsList = ratingsList;
	}

	@OneToMany(mappedBy = "projects")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public void assignRatingToThisproject(List<Rating> ratings) {

		this.setRatingsList(ratings);
		for (Rating r : ratings) {
			r.setProjects(this);
		}

	}

	public void assignCommentToThisproject(List<Comment> comments) {
		this.setComments(comments);

		for (Comment c : comments) {
			c.setProjects(this);
		}

	}

	@OneToMany(mappedBy = "projects")
	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public void assignDonationToThisproject(List<Donation> donations) {
		this.setDonations(donations);
		for (Donation d : donations) {
			d.setProjects(this);
		}

	}

	public String toString() {
		return "Projects [idProject=" + idProject + ", nameProject="
				+ nameProject + ", typeProject=" + typeProject
				+ ", descripProject=" + descripProject + ", dateProject="
				+ dateProject + ", moneyProject=" + moneyProject
				+ ", partnerProject=" + partnerProject + ", ownerProject="
				+ ownerProject + "]";
	}
	

	
	
	

}
