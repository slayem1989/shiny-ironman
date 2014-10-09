package persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Challenge implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int IdChallenge;
	private String NameChallenge;
	private Date DateBegin;
	private Date Datefinish;
	private List<User> listUser;

	private Winner winner;

	public Challenge() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdChallenge() {
		return IdChallenge;
	}

	public void setIdChallenge(int idChallenge) {
		IdChallenge = idChallenge;
	}

	public String getNameChallenge() {
		return NameChallenge;
	}

	public void setNameChallenge(String nameChallenge) {
		NameChallenge = nameChallenge;
	}

	public Date getDateBegin() {
		return DateBegin;
	}

	public void setDateBegin(Date dateBegin) {
		DateBegin = dateBegin;
	}

	public Date getDatefinish() {
		return Datefinish;
	}

	public void setDatefinish(Date datefinish) {
		Datefinish = datefinish;
	}

	@ManyToMany
	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	@ManyToOne
	public Winner getWinner() {
		return winner;
	}

	public void setWinner(Winner winner) {
		this.winner = winner;
	}

	public String toString() {
		return "Challenge [IdChallenge=" + IdChallenge + ", NameChallenge="
				+ NameChallenge + ", DateBegin=" + DateBegin + ", Datefinish="
				+ Datefinish + ", listUser=" + listUser + ", winner=" + winner
				+ "]";
	}
	

}
