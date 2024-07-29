package kodlamaio.hrms2.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employer_id")
	private int employerId;
	@Column(name="web_site")
	private String webSite;
	@Column(name="company_name")
	private String companyName;
	@Column(name="phone_number")
	private String phoneNumber;
	

}
