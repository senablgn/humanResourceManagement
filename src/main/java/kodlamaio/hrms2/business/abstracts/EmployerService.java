package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.Employer;


public interface EmployerService {
	DataResult<List<Employer>>getEmployers();
	Result add(Employer employer);
	

}
