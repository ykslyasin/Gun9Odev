package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.cv.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
}
