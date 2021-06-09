package kodlamaio.HumanRMS.entities.concrete.cv;

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
@Table(name="programming_knowledge_cv")
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingKnowledgeCv {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="programming_knowledge")
	private String programmingLanguage;
	
	@JsonIgnore
	@OneToMany(mappedBy = "programmingKnowledgeCv")
	private List<Cv> cv;
	
}
