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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="education_status_cv")
@AllArgsConstructor
@NoArgsConstructor
public class EducationStatusCv {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="primary_school_education_date")
	private LocalDate primarySchoolGraduationDate;
	
	@Column(name="high_school_education_date")
	private LocalDate highSchoolGraduationDate;
	
	@Column(name="university_education_date")
	private LocalDate universityGraduationDate;
	
	@Column(name="is_graduate")
	private boolean isGraduate;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="department")
	private String department;
	
	@JsonIgnore
	@OneToMany(mappedBy = "educationStatusCv")
	private List<Cv> cv;
}
