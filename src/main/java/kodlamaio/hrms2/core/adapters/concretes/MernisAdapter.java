package kodlamaio.hrms2.core.adapters.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.adapters.abstracts.MernisCheckService;
import kodlamaio.hrms2.entities.concretes.Candidate;
@Service
public class MernisAdapter implements MernisCheckService{

	@Override

	public boolean checkMernis(Candidate candidate) {
		
		return true;
	}
	
	

}
