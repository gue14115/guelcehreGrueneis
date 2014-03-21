package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Operation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by anil on 10/03/14.
 */
public interface OperationRepository extends CrudRepository<Operation, Long>{
}
