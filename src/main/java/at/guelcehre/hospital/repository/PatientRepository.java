package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by anil on 10/03/14.
 */
public interface PatientRepository extends CrudRepository<Patient, Long> {
    Patient findByName(String name);
}
