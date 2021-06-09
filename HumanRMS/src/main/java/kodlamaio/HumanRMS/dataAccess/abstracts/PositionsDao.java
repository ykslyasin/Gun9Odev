package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.Positions;

public interface PositionsDao extends JpaRepository<Positions, Integer>{

}
