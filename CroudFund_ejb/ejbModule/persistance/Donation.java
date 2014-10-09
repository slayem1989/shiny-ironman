package persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Donation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDonation;
	private Float sumDonation;
	private Date dateDonation;
	
	private DonationPk donationPk ;
	private Investor investor;
	private Projects projects;
	

	@EmbeddedId
	public DonationPk getDonationPk() {
		return donationPk;
	}

	public void setDonationPk(DonationPk donationPk) {
		this.donationPk = donationPk;
	}

	@ManyToOne
	@JoinColumn(insertable = false ,updatable = false , name = "idInvestor" ,referencedColumnName = "idInvestor")

	public Investor getInvestor() {
		return investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}
	@ManyToOne
	@JoinColumn(insertable = false ,updatable = false , name = "idProject" ,referencedColumnName = "idProject")
	public Projects getProjects() {
		return projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public int getIdDonation() {
		return idDonation;
	}

	public void setIdDonation(int idDonation) {
		this.idDonation = idDonation;
	}

	public Float getSumDonation() {
		return sumDonation;
	}

	public void setSumDonation(Float sumDonation) {
		this.sumDonation = sumDonation;
	}

	public Date getDateDonation() {
		return dateDonation;
	}

	public void setDateDonation(Date dateDonation) {
		this.dateDonation = dateDonation;
	}

	public String toString() {
		return "Donation [idDonation=" + idDonation + ", sumDonation="
				+ sumDonation + ", dateDonation=" + dateDonation
				+ ", donationPk=" + donationPk + ", investor=" + investor
				+ ", projects=" + projects + "]";
	}
	

}
