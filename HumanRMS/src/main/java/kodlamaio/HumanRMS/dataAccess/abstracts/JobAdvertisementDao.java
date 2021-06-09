package kodlamaio.HumanRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.HumanRMS.entities.concrete.JobAdvertisement;
import kodlamaio.HumanRMS.entities.dtos.JobAdvertDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByEmployers_CompanyName(String companyName);
	
	@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getByIsActive();
	
	@Query("Select new kodlamaio.HumanRMS.entities.dtos.JobAdvertDto"
			+ "(j.id, e.companyName, j.jobDetail, j.numberOfPositions, j.publishDate, j.applicationDeadline, j.isActive) "
			+ "From Employers e Inner Join e.jobAdvertisement j")
	List<JobAdvertDto> getJobAdvertisementDetail();
	
	@Query("Select new kodlamaio.HumanRMS.entities.dtos.JobAdvertDto"
			+ "(j.id, e.companyName, j.jobDetail, j.numberOfPositions, j.publishDate, j.applicationDeadline, j.isActive) "
			+ "From Employers e Inner Join e.jobAdvertisement j")
	List<JobAdvertDto> getJobAdvertisementDetailWithIsActive();
	
}
