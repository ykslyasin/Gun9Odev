package kodlamaio.HumanRMS.dataAccess.abstracts.Cv;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;

public interface EducationStatusCvDao extends JpaRepository<EducationStatusCv, Integer>{

}
