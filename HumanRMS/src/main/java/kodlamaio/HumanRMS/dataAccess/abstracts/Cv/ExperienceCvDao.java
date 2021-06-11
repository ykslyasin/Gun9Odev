package kodlamaio.HumanRMS.dataAccess.abstracts.Cv;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;

public interface ExperienceCvDao extends JpaRepository<ExperienceCv, Integer>{

}
