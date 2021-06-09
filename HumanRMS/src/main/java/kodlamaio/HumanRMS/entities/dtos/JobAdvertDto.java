package kodlamaio.HumanRMS.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertDto {
	
	private int id;
	private String companyName;
	private String jobDetail;
	private int numberOfPositions;
	private LocalDate publishDate;
	private LocalDate applicationDeadline;
	private boolean isActive;
}
