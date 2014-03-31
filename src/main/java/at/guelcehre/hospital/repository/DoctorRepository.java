package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by anil on 10/03/14.
 */
@RepositoryRestResource(path="/doctors")
public interface DoctorRepository extends CrudRepository<Doctor, Long>{
    Doctor findByName(String name);
}
