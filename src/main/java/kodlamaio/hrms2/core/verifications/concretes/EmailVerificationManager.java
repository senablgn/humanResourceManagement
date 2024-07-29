package kodlamaio.hrms2.core.verifications.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.core.utilities.results.SuccessResult;
import kodlamaio.hrms2.core.verifications.abstracts.EmailVerificationService;
@Service
public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public Result verifyEmail() {
		
		return new SuccessResult("verification code sent");
	}
	
	
	

}
