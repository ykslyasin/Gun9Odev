package kodlamaio.HumanRMS.business.concrete.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Cv.CvService;
import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanRMS.entities.concrete.Employees;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;
import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	private CvService cvService;
	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao , CvService cvService) {
		super();
		this.employeeDao = employeeDao;
		this.cvService = cvService;
		
	}
	
	
	@Override
	public Result registration(Employees employees) {
		if(checkEmployeeWithMail(employees.getEMail()).isSuccess() && 
		   checkEmployeeWithNationalId(employees.getNationalId()).isSuccess()) {
			add(employees);
			return new SuccessResult("Registration successful.");
		}else {
			return new ErrorResult("Registration failed.");
		}
		
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>
		(this.employeeDao.findAll() , "Data listed.");
	}

	@Override
	public Result add(Employees employees) {
		this.employeeDao.save(employees);
		return new SuccessResult("Employee added to system.");
	}

	@Override
	public Result checkEmployeeWithMail(String email) {
		if(employeeDao.getByeMail(email).isEmpty()) {
			return new SuccessResult();
		}
		return new ErrorResult("This email registered already.");
	}

	@Override
	public Result checkEmployeeWithNationalId(long nationalId) {
		if(employeeDao.getBynationalId(nationalId).isEmpty()) {
			return new SuccessResult();
		}
		return new ErrorResult("This national identity registered already");
	}
	
	public Result addCv(Cv cv , ExperienceCv experienceCv , EducationStatusCv educationStatusCv , ForeignLanguageCv foreignLanguageCv , Employees employees) {
		this.cvService.addCv(cv , experienceCv , educationStatusCv , foreignLanguageCv);
		return new SuccessResult("Cv added to : " + employees.getFirstName());
	}

}
