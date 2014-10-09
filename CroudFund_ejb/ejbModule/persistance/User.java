package persistance;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUser;
	private String firstNameUser;
	private String lastNameUser;
	private Date birthdayUser;
	private String genderUser;
	private String languagesUser;
	private String mailUser;
	private int phoneUser;
	private String currentLocationUser;
	private String jobsUser;
	private int ageUser;
	private Byte[] pictureUser;
	private Forum forum;
	private List<Challenge> listChallenge;
	private List<Rating> ratingsList;
	private List<Comment> comments;

	@OneToMany(mappedBy = "user")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstNameUser() {
		return firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public Date getBirthdayUser() {
		return birthdayUser;
	}

	public void setBirthdayUser(Date birthdayUser) {
		this.birthdayUser = birthdayUser;
	}

	public String getGenderUser() {
		return genderUser;
	}

	public void setGenderUser(String genderUser) {
		this.genderUser = genderUser;
	}

	public String getLanguagesUser() {
		return languagesUser;
	}

	public void setLanguagesUser(String languagesUser) {
		this.languagesUser = languagesUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public int getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(int phoneUser) {
		this.phoneUser = phoneUser;
	}

	public String getCurrentLocationUser() {
		return currentLocationUser;
	}

	public void setCurrentLocationUser(String currentLocationUser) {
		this.currentLocationUser = currentLocationUser;
	}

	public String getJobsUser() {
		return jobsUser;
	}

	public void setJobsUser(String jobsUser) {
		this.jobsUser = jobsUser;
	}

	public int getAgeUser() {
		return ageUser;
	}

	public void setAgeUser(int ageUser) {
		this.ageUser = ageUser;
	}

	public Byte[] getPictureUser() {
		return pictureUser;
	}

	public void setPictureUser(Byte[] pictureUser) {
		this.pictureUser = pictureUser;
	}

	@ManyToOne
	@JoinColumn(name = "Forum_Fk")
	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	@ManyToMany(mappedBy = "listUser")
	public List<Challenge> getListChallenge() {
		return listChallenge;
	}

	public void setListChallenge(List<Challenge> listChallenge) {
		this.listChallenge = listChallenge;
	}

	@OneToMany(mappedBy = "user")
	public List<Rating> getRatingsList() {
		return ratingsList;
	}

	public void setRatingsList(List<Rating> ratingsList) {
		this.ratingsList = ratingsList;
	}

	public void assignRatingToThisUser(List<Rating> ratingsList) {

		this.setRatingsList(ratingsList);
		for (Rating r : ratingsList) {
			r.setUser(this);

		}
	}

	public void assignCommentToThisUser(List<Comment> comments) {
		this.setComments(comments);
		for (Comment c : comments) {
			c.setUser(this);
		}

	}

	
	public String toString() {
		return "User [idUser=" + idUser + ", firstNameUser=" + firstNameUser
				+ ", lastNameUser=" + lastNameUser + ", birthdayUser="
				+ birthdayUser + ", genderUser=" + genderUser
				+ ", languagesUser=" + languagesUser + ", mailUser=" + mailUser
				+ ", phoneUser=" + phoneUser + ", currentLocationUser="
				+ currentLocationUser + ", jobsUser=" + jobsUser + ", ageUser="
				+ ageUser + ", pictureUser=" + Arrays.toString(pictureUser)
				+ "]";
	}

}
