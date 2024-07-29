package kodlamaio.hrms2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms2.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
