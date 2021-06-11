package kodlamaio.HumanRMS.dataAccess.abstracts.Cv;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.cv.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
}
