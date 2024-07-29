package kodlamaio.hrms2.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	

	
}
