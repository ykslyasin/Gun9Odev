package kodlamaio.HumanRMS.business.concrete.JobAdvertisement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.JobAdvertisement.JobAdvertisementService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.HumanRMS.entities.concrete.JobAdvertisement;
import kodlamaio.HumanRMS.entities.dtos.JobAdvertDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll() , "Data listed.");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisement added to system.");
	}

	@Override
	public DataResult<List<JobAdvertDto>> getJobAdvertisementDetail() {
		return new SuccessDataResult<List<JobAdvertDto>>
		(this.jobAdvertisementDao.getJobAdvertisementDetail() , "Data listed");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployers_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployers_CompanyName(companyName) , "Data listed");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC , "applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort) , "Data listed");
	}

	@Override
	public DataResult<List<JobAdvertDto>> getJobAdvertisementDetailWithIsActive() {
		return new SuccessDataResult<List<JobAdvertDto>>
		(this.jobAdvertisementDao.getJobAdvertisementDetailWithIsActive(), "Data listed");
	}

}
