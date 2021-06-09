package kodlamaio.HumanRMS.core.adapters;

import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeMernisCheckService;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.entities.concrete.Employees;

public class EmployeeMernisServiceAdapter implements EmployeeMernisCheckService{


	@Override
	public Result CheckIfRealPerson(Employees employees){
		return new SuccessResult();
	}
	
	
}
