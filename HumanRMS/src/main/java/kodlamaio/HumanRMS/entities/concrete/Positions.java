package kodlamaio.HumanRMS.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="positions")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisement"})
public class Positions{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int position_id;
	
	@NotNull
	@NotBlank
	@Column(name="positions")
	private String positions;
	
	@JsonIgnore
	@OneToMany(mappedBy="positions")
	private List<JobAdvertisement> jobAdvertisement;
	
}
