package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anil on 16.01.14.
 */
@Repository
public class PersonJpaRepository extends AbstractJpaRepository<Person>{
    public List<Person> findAll(){
        return entityManager().createQuery("SELECT p FROM Doctor p", Person.class).getResultList();
    }
    public Person findById(Long id){
        return entityManager().find(Person.class,id);
    }
}
