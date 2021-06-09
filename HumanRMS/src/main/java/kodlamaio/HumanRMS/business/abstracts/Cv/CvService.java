package kodlamaio.HumanRMS.business.abstracts.Cv;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;

public interface CvService {
	
	DataResult<List<Cv>> getAll();
	
	Result add(Cv cv);
}
