package kodlamaio.HumanRMS.business.abstracts.Employee;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employees;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;
import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

public interface EmployeeService {
	
	DataResult<List<Employees>> getAll();
	
	Result add(Employees employees);
	
	Result checkEmployeeWithMail(String email);
	
	Result checkEmployeeWithNationalId(long nationalId);
	
	Result registration(Employees employees);
	
	Result addCv(Cv cv , ExperienceCv experienceCv , EducationStatusCv educationStatusCv , ForeignLanguageCv foreignLanguageCv , Employees employees);
	
}
