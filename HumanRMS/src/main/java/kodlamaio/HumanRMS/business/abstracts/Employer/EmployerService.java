package kodlamaio.HumanRMS.business.abstracts.Employer;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employers;

public interface EmployerService {
	DataResult<List<Employers>> getAll();
	
	Result add(Employers employers);
	
	Result checkEmployer(String email);
	
	Result registration(Employers employers);
}
