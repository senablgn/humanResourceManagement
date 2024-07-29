package kodlamaio.hrms2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
