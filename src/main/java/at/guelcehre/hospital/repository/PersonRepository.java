package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by anil on 10/03/14.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByName(String name);
}
