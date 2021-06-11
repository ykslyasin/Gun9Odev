package kodlamaio.HumanRMS.business.concrete.Cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Cv.CvService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.Cv.CvDao;
import kodlamaio.HumanRMS.dataAccess.abstracts.Cv.EducationStatusCvDao;
import kodlamaio.HumanRMS.dataAccess.abstracts.Cv.ExperienceCvDao;
import kodlamaio.HumanRMS.dataAccess.abstracts.Cv.ForeignLanguageCvDao;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;
import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

@Service
public class CvManager implements CvService {
	
	private CvDao cvDao;
	private EducationStatusCvDao educationStatusDao;
	private ExperienceCvDao experienceCvDao;
	private ForeignLanguageCvDao foreignLanguageCvDao;
	
	@Autowired
	public CvManager(CvDao cvDao ,
					 EducationStatusCvDao educationStatusDao , 
					 ExperienceCvDao experienceCvDao , 
					 ForeignLanguageCvDao foreignLanguageCvDao) {
		this.cvDao = cvDao;
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv added to system.");
	}

	@Override
	public Result add(ExperienceCv experienceCv) {
		this.experienceCvDao.save(experienceCv);
		return new SuccessResult("Experience added to .");
	}

	@Override
	public Result add(EducationStatusCv educationStatusCv) {
		this.educationStatusDao.save(educationStatusCv);
		return new SuccessResult("Education status added to system. ");
	}

	@Override
	public Result add(ForeignLanguageCv foreignLanguageCv) {
		this.foreignLanguageCvDao.save(foreignLanguageCv);
		return new SuccessResult("Foreign Language added to syste.");
	}

	@Override
	public DataResult<List<Cv>> getAllCv() {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll() , "Data listed.");
	}

	@Override
	public DataResult<List<EducationStatusCv>> getAllEducationStatusCv() {
		return new SuccessDataResult<List<EducationStatusCv>>
		(this.educationStatusDao.findAll() , "Data listed.");
	}

	@Override
	public DataResult<List<ExperienceCv>> getAllExperienceCv() {
		return new SuccessDataResult<List<ExperienceCv>>
		(this.experienceCvDao.findAll() , "Data listed.");
	}

	@Override
	public DataResult<List<ForeignLanguageCv>> getAllForeignLanguageCv() {
		return new SuccessDataResult<List<ForeignLanguageCv>>
		(this.foreignLanguageCvDao.findAll() , "Data listed.");
	}
	
	public Result addCv(Cv cv , 
						ExperienceCv experienceCv , 
						EducationStatusCv educationStatusCv , 
						ForeignLanguageCv foreignLanguageCv) {
		add(educationStatusCv);
		add(experienceCv);
		add(foreignLanguageCv);
		add(cv);
		
		return new SuccessResult("Cv added to system.");
	}

	
	

}
