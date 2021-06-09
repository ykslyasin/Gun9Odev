package kodlamaio.HumanRMS.business.abstracts.Employee;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employees;

public interface EmployeeService {
	
	DataResult<List<Employees>> getAll();
	
	Result add(Employees employees);
	
	Result checkEmployeeWithMail(String email);
	
	Result checkEmployeeWithNationalId(long nationalId);
	
	Result registration(Employees employees);
	
}
