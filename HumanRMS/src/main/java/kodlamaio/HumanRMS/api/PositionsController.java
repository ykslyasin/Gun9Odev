package kodlamaio.HumanRMS.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HumanRMS.entities.concrete.Positions;
import kodlamaio.HumanRMS.business.abstracts.Positions.PositionsService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;

@RestController
@RequestMapping("/api/positions")
public class PositionsController {
	
	private PositionsService positionsService;

	@Autowired
	public PositionsController(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Positions>> getAll(){
		return this.positionsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Positions positions) {
		return this.positionsService.add(positions);
	}
}

