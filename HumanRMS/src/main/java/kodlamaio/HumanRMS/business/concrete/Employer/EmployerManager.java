package kodlamaio.HumanRMS.business.concrete.Employer;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanRMS.entities.concrete.Employers;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	
	public Result registration(Employers employers) {
		if(checkEmployer(employers.getEMail()).isSuccess()) {
			add(employers);
			return new SuccessResult("Registration successful.");
			
		}else {
			return new ErrorResult("Registration failed. This email already registered.");
		}
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employerDao.findAll() , "Data listed");
	}

	@Override
	public Result add(Employers employers) {
		this.employerDao.save(employers);
		return new SuccessResult("Employer added to system");
	}
	
	public Result checkEmployer(String email) {
		if(employerDao.getByeMail(email).isEmpty()) {
			return new SuccessResult();
		}
		return new ErrorResult("This email registered already");
	}
	

}
