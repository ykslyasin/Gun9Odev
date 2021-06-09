package kodlamaio.HumanRMS.business.abstracts.City;
import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.City;

public interface CityService {
	
	DataResult<List<City>> getAll();
	
	Result add(City city);
	
	
}
