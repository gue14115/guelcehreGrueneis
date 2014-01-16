package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anil on 16.01.14.
 */
@Repository
public class DoctorJpaRepository extends AbstractJpaRepository<Doctor>{
    public List<Doctor> findAll(){
        return entityManager().createQuery("SELECT d FROM Doctor d", Doctor.class).getResultList();
    }
    public Doctor findById(Long id){
        return entityManager().find(Doctor.class,id);
    }
}
