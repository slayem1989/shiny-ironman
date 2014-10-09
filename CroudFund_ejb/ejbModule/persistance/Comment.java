package persistance;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CommentPk commentPk;
	private User user;
	private Projects projects1;

	private Date dateComment;
	private Time timeComment;
	private String contents;

	public Comment() {
	}

	@EmbeddedId
	public CommentPk getCommentPk() {
		return commentPk;
	}

	public void setCommentPk(CommentPk commentPk) {
		this.commentPk = commentPk;
	}

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name = "idUser", referencedColumnName = "idUser")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name = "idProject", referencedColumnName = "idProject")
	public Projects getProjects() {
		return projects1;
	}

	public void setProjects(Projects projects) {
		this.projects1 = projects;
	}

	public Date getDateComment() {
		return dateComment;
	}

	public void setDateComment(Date dateComment) {
		this.dateComment = dateComment;
	}

	public Time getTimeComment() {
		return timeComment;
	}

	public void setTimeComment(Time timeComment) {
		this.timeComment = timeComment;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String toString() {
		return "Comment [commentPk=" + commentPk + ", user=" + user
				+ ", projects1=" + projects1 + ", dateComment=" + dateComment
				+ ", timeComment=" + timeComment + ", contents=" + contents
				+ "]";
	}
	

}
