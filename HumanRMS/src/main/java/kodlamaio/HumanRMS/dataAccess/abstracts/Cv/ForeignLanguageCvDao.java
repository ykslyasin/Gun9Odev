package kodlamaio.HumanRMS.dataAccess.abstracts.Cv;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

public interface ForeignLanguageCvDao extends JpaRepository<ForeignLanguageCv, Integer>{

}
