package persistance;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Investor implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idInvestor;
	private String firstNameInvestor;
	private String lastNameInvestor;
	private Date birthdayInvestor;
	private String genderInvestor;
	private String languagesInvestor;
	private String mailInvestor;
	private int phoneInvestor;
	private String currentLocationInvestor;
	private String jobsInvestor;
	private int ageInvestor;
	private Byte[] pictureInvestor;
	private List<Projects> listProjects;
	private List<Donation> donations ;

	public Investor() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdInvestor() {
		return idInvestor;
	}

	public void setIdInvestor(int idInvestor) {
		this.idInvestor = idInvestor;
	}

	public String getFirstNameInvestor() {
		return firstNameInvestor;
	}

	public void setFirstNameInvestor(String firstNameInvestor) {
		this.firstNameInvestor = firstNameInvestor;
	}

	public String getLastNameInvestor() {
		return lastNameInvestor;
	}

	public void setLastNameInvestor(String lastNameInvestor) {
		this.lastNameInvestor = lastNameInvestor;
	}

	public Date getBirthdayInvestor() {
		return birthdayInvestor;
	}

	public void setBirthdayInvestor(Date birthdayInvestor) {
		this.birthdayInvestor = birthdayInvestor;
	}

	public String getGenderInvestor() {
		return genderInvestor;
	}

	public void setGenderInvestor(String genderInvestor) {
		this.genderInvestor = genderInvestor;
	}

	public String getLanguagesInvestor() {
		return languagesInvestor;
	}

	public void setLanguagesInvestor(String languagesInvestor) {
		this.languagesInvestor = languagesInvestor;
	}

	public String getMailInvestor() {
		return mailInvestor;
	}

	public void setMailInvestor(String mailInvestor) {
		this.mailInvestor = mailInvestor;
	}

	public int getPhoneInvestor() {
		return phoneInvestor;
	}

	public void setPhoneInvestor(int phoneInvestor) {
		this.phoneInvestor = phoneInvestor;
	}

	public String getCurrentLocationInvestor() {
		return currentLocationInvestor;
	}

	public void setCurrentLocationInvestor(String currentLocationInvestor) {
		this.currentLocationInvestor = currentLocationInvestor;
	}

	public String getJobsInvestor() {
		return jobsInvestor;
	}

	public void setJobsInvestor(String jobsInvestor) {
		this.jobsInvestor = jobsInvestor;
	}

	public int getAgeInvestor() {
		return ageInvestor;
	}

	public void setAgeInvestor(int ageInvestor) {
		this.ageInvestor = ageInvestor;
	}

	public Byte[] getPictureInvestor() {
		return pictureInvestor;
	}

	public void setPictureInvestor(Byte[] pictureInvestor) {
		this.pictureInvestor = pictureInvestor;
	}

	@ManyToMany( mappedBy = "listInverstors")
	public List<Projects> getListProjects() {
		return listProjects;
	}

	public void setListProjects(List<Projects> listProjects) {
		this.listProjects = listProjects;
	}
	
	@OneToMany(mappedBy = "investor")
	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}
	
	public void assignDonationToThisInvestor(List<Donation> donations) {
		this.setDonations(donations);
		for (Donation d : donations) {
			d.setInvestor(this);
		}

	}

	public String toString() {
		return "Investor [idInvestor=" + idInvestor + ", firstNameInvestor="
				+ firstNameInvestor + ", lastNameInvestor=" + lastNameInvestor
				+ ", birthdayInvestor=" + birthdayInvestor
				+ ", genderInvestor=" + genderInvestor + ", languagesInvestor="
				+ languagesInvestor + ", mailInvestor=" + mailInvestor
				+ ", phoneInvestor=" + phoneInvestor
				+ ", currentLocationInvestor=" + currentLocationInvestor
				+ ", jobsInvestor=" + jobsInvestor + ", ageInvestor="
				+ ageInvestor + ", pictureInvestor="
				+ Arrays.toString(pictureInvestor) + ", listProjects="
				+ listProjects + ", donations=" + donations + "]";
	}
	

}
