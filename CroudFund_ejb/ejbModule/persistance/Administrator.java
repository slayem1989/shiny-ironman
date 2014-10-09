package persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAdmin;
	private String loginAdmin;
	private String passwordAdmin;

	public Administrator(int idAdmin, String loginAdmin, String passwordAdmin) {
		super();
		this.idAdmin = idAdmin;
		this.loginAdmin = loginAdmin;
		this.passwordAdmin = passwordAdmin;
	}

	public Administrator() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getLoginAdmin() {
		return loginAdmin;
	}

	public void setLoginAdmin(String loginAdmin) {
		this.loginAdmin = loginAdmin;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}

	public String toString() {
		return "Administrator [idAdmin=" + idAdmin + ", loginAdmin="
				+ loginAdmin + ", passwordAdmin=" + passwordAdmin + "]";
	}

	
}
