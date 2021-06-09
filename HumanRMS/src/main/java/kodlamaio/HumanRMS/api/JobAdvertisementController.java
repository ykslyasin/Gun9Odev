package kodlamaio.HumanRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HumanRMS.business.abstracts.JobAdvertisement.JobAdvertisementService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.JobAdvertisement;
import kodlamaio.HumanRMS.entities.dtos.JobAdvertDto;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getallDetail")
	public DataResult<List<JobAdvertDto>> getJobAdvertisementDetail(){
		return this.jobAdvertisementService.getJobAdvertisementDetail();
	}
	
	@GetMapping("/getallDetailByActive")
	public DataResult<List<JobAdvertDto>> getJobAdvertisementDetailWithIsActive(){
		return this.jobAdvertisementService.getJobAdvertisementDetailWithIsActive();
	}
	
	@GetMapping("/getByCompanyName")
	DataResult<List<JobAdvertisement>> getByEmployers_CompanyName(String companyName){
		return this.jobAdvertisementService.getByEmployers_CompanyName(companyName);
	}
	
	@GetMapping("/getallSortedByDate")
	public DataResult<List<JobAdvertisement>> getAllSortedByDate(){
		return this.jobAdvertisementService.getAllSortedByDate();
	}
	
}
