package kodlamaio.HumanRMS.entities.concrete.cv;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="experience_cv")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})

public class ExperienceCv {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="previous_company")
	private String previousCompany;
	
	@Column(name="start_date")
	private LocalDate lastJobEntry;
	
	@Column(name="quit_date")
	private LocalDate lastJobExit;
	
	@Column(name="is_quit_job")
	private boolean isQuitJob;
	
	@Column(name="position")
	private String position;
	
	@JsonIgnore
	@OneToMany(mappedBy = "experienceCv")
	private List<Cv> cv;
	
	
}
