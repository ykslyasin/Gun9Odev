package kodlamaio.HumanRMS.business.abstracts.Positions;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Positions;

public interface PositionsService {
	DataResult<List<Positions>> getAll();
	
	Result add(Positions positions);
}
