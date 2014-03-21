package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Doctor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by anil on 10/03/14.
 */
public interface DoctorRepository extends CrudRepository<Doctor, Long>{
    Doctor findByName(String name);
}
