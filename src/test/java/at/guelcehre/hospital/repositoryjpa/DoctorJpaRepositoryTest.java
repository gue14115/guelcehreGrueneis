package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Doctor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by anil on 24/02/14.
 */
public class DoctorJpaRepositoryTest extends AbstractJpaRepositoryTest{
    @Test
    public void verifyFindByUnknownId() {
        DoctorJpaRepository doctorJpaRepository = new DoctorJpaRepository();
        doctorJpaRepository.setEntityManager(entityManager);

        Doctor doctor = doctorJpaRepository.findById(1L);

        Assert.assertNull(doctor);
    }

    @Test
    public void verifyFindById() {

        DoctorJpaRepository doctorJpaRepository = new DoctorJpaRepository();
        doctorJpaRepository.setEntityManager(entityManager);

        Date date = new Date();
        Doctor doctor = new Doctor("Anil",date,true,"100000","Joseph 7","1120 Wien","Everything","Neurology");
        doctorJpaRepository.persist(doctor);

        Doctor doctor2 = doctorJpaRepository.findById(doctor.getId());

        Assert.assertNotNull(doctor2);
        Assert.assertEquals(doctor, doctor2);
    }
}
