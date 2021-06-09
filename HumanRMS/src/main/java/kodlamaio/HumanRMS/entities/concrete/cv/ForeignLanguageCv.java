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
@Table(name="foreign_language_cv")
@NoArgsConstructor
@AllArgsConstructor
public class ForeignLanguageCv {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="language")
	private String language;
	
	@Column(name="language_level")
	private String languageLevel;
	
	@JsonIgnore
	@OneToMany(mappedBy = "foreignLanguageCv")
	private List<Cv> cv;
}
