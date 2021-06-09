package kodlamaio.HumanRMS.entities.concrete.cv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv")
@NoArgsConstructor
@AllArgsConstructor
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github_address")
	private String githubAdress;
	
	@Column(name="linkedin_address")
	private String linkedin_address;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name="education_status_id")
	private EducationStatusCv educationStatusCv;
	
	@ManyToOne()
	@JoinColumn(name="experience_id")
	private ExperienceCv experienceCv;
	
	@ManyToOne()
	@JoinColumn(name="foreign_language_id")
	private ForeignLanguageCv foreignLanguageCv;
	
	@ManyToOne()
	@JoinColumn(name="programming_knowledge_id")
	private ProgrammingKnowledgeCv programmingKnowledgeCv;
}
