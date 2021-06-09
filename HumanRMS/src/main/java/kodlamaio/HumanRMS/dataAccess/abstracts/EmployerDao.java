package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.HumanRMS.entities.concrete.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer>{
	
	List<Employers> getByeMail(String eMail);
}
