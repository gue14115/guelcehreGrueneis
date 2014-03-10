package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Patient;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by anil on 24/02/14.
 */
public class PatientJpaRepositoryTest extends AbstractJpaRepositoryTest{
    @Test
    public void findAllWithoutPatients() {
        PatientJpaRepository patientJpaRepository = new PatientJpaRepository();
        patientJpaRepository.setEntityManager(entityManager);

        // expect
        assertThat(patientJpaRepository.findAll().isEmpty(),
                is(equalTo(Boolean.TRUE)));
    }

    @Test
    public void findByIdWithoutPatients() {
        PatientJpaRepository patientJpaRepository = new PatientJpaRepository();
        patientJpaRepository.setEntityManager(entityManager);

        // expect
        assertThat(patientJpaRepository.findById(0l), is(nullValue()));
    }

    @Test
    public void persistAndFindPatient() {
        PatientJpaRepository patientJpaRepository = new PatientJpaRepository();
        patientJpaRepository.setEntityManager(entityManager);

        Patient patient = new Patient("Abi",new Date(), true, "666", "Stachegasse 7","1120 Wien","Influenza");

        patientJpaRepository.persist(patient);
        assertThat(patient.getId(),is(notNullValue()));
        Long newId = patient.getId();

        logger.info("Created teacher with id: {} - teacher: {}", newId, patient);

        Patient patientByFind = patientJpaRepository.findById(newId);
        assertThat(patientByFind,equalTo(patient));
    }
}
