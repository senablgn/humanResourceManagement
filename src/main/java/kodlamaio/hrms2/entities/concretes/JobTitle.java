package kodlamaio.hrms2.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jobtitle")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="job_title")
	private String jotTitle;
	
	public JobTitle() {}

	public JobTitle(int id, String jotTitle) {
		super();
		this.id = id;
		this.jotTitle = jotTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJotTitle() {
		return jotTitle;
	}

	public void setJotTitle(String jotTitle) {
		this.jotTitle = jotTitle;
	}

}
