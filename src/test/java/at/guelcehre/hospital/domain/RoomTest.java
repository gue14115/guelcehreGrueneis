package at.guelcehre.hospital.domain;

import static org.junit.Assert.*;

import at.guelcehre.hospital.domain.Doctor;
import at.guelcehre.hospital.domain.Patient;
import at.guelcehre.hospital.domain.Room;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class RoomTest {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Before
    public void setup() {
        entityManagerFactory = Persistence
                .createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void teardown() {
        if (entityManager != null)
            entityManager.getTransaction().commit();
        if (entityManager != null)
            entityManager.close();
        if (entityManagerFactory != null)
            entityManagerFactory.close();
    }

	@Test
	public void test() {
        Date d = new Date();
        Patient patient = new Patient("Abi",new Date(), true, "666", "Stachegasse 7","1120 Wien","Influenza");
        Doctor doctor = new Doctor("Anil",d,true,"100000","Joseph 7","1120 Wien","Everything","Neurology");
        Room room = new Room("Operationroom 7","1","2",patient,doctor);
        entityManager.persist(patient);
        entityManager.persist(doctor);
        entityManager.persist(room);
	}

}
