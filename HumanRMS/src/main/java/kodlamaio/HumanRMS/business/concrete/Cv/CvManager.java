package kodlamaio.HumanRMS.business.concrete.Cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Cv.CvService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.CvDao;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;

@Service
public class CvManager implements CvService{
	
	private CvDao cvDao;
	
	@Autowired
	public CvManager(CvDao cvDao) {
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll() , "Data listed.");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.saveAndFlush(cv);
		return new SuccessResult("Cv added to system.");
	}

}
