package kodlamaio.HumanRMS.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisement")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	

    // private int employerId;
	
    // @Column(name="position_id")
	// private int positionId;
	
	// @Column(name="city_id")
	// private int cityId;
	
	@Column(name="job_detail")
	private String jobDetail;
	
	@Column(name="max_payment")
	private int maxPayment;
	
	@Column(name="min_payment")
	private int minPayment;
	
	@Column(name="number_of_positions")
	private int numberOfPositions;
	
	@Column(name="publish_date")
	private LocalDate publishDate;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="positions_id")
	private Positions positions;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employers employers;
	
}
