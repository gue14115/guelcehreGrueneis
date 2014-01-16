package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anil on 16.01.14.
 */
@Repository
public class PatientJpaRepository extends AbstractJpaRepository<Patient>{
    public List<Patient> findAll(){
        return entityManager().createQuery("SELECT pa FROM Doctor pa", Patient.class).getResultList();
    }
    public Patient findById(Long id){
        return entityManager().find(Patient.class,id);
    }
}
