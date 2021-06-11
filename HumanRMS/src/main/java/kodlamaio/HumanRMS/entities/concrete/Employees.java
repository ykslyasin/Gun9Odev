package kodlamaio.HumanRMS.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;

@Data
@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
public class Employees extends User{
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="national_identity")
	private long nationalId;
	
	@Column(name="birth_date")
	private String birthDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employees")
	private List<Cv> cv;
	
}
