package kodlamaio.hrms2.core.verifications.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.core.verifications.abstracts.HRMSVerificationService;

@Service
public class HRMSVerificationManager implements HRMSVerificationService{

	@Override
	public Result verify() {
		
		return new SuccessResult("hrms staff approved");
	}
	
	
	

}
