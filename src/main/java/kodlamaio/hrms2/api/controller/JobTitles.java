package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.JobTitleService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.JobTitle;
import kodlamaio.hrms2.entities.concretes.User;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitles {
	
	private JobTitleService jobTitleService;
	
	
	@Autowired
	public JobTitles(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}


	@GetMapping("/getJobs")
	public DataResult<List<JobTitle>> getAll(){
		return this.jobTitleService.getJobs();
		
	}
	
	@PostMapping("/addJob")
	public Result addUser(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}

}
