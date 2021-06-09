package kodlamaio.HumanRMS.business.abstracts.JobAdvertisement;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.JobAdvertisement;
import kodlamaio.HumanRMS.entities.dtos.JobAdvertDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertDto>> getJobAdvertisementDetail();
	
	DataResult<List<JobAdvertDto>> getJobAdvertisementDetailWithIsActive();
	
	DataResult<List<JobAdvertisement>> getByEmployers_CompanyName(String companyName);
	
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
}
