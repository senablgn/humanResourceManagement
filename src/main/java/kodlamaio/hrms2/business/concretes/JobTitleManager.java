package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms2.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}



	@Override
	
	public DataResult<List<JobTitle>> getJobs() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "jobs listed");
				
	}



	@Override
	public Result add(JobTitle jobTitle) {
		jobTitleDao.save(jobTitle);
		return new SuccessResult("job added");
	}
	
	
	
	

}
