package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.Employees;

public interface EmployeeDao extends JpaRepository<Employees, Integer>{
	
	List<Employees> getByeMail(String eMail);
	
	List<Employees> getBynationalId(long nationalId);
}
