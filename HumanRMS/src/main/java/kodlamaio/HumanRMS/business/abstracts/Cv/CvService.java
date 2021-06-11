package kodlamaio.HumanRMS.business.abstracts.Cv;

import java.util.List;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;
import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

public interface CvService {
	
	DataResult<List<Cv>> getAllCv();
	
	Result add(Cv cv);
	
	DataResult<List<EducationStatusCv>> getAllEducationStatusCv();
	
	Result add(EducationStatusCv educationStatusCv);
	
	DataResult<List<ExperienceCv>> getAllExperienceCv();
	
	Result add(ExperienceCv experienceCv);
	
	DataResult<List<ForeignLanguageCv>> getAllForeignLanguageCv();
	
	Result add(ForeignLanguageCv foreignLanguageCv);
	
	Result addCv(Cv cv , 
			ExperienceCv experienceCv , 
			EducationStatusCv educationStatusCv , 
			ForeignLanguageCv foreignLanguageCv);
	
}
