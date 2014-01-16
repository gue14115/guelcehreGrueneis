package at.guelcehre.hospital.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class PatientTest {
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
        Patient patient = new Patient("Abi",new Date(), true, "666", "Stachegasse 7","1120 Wien","Influenza");
        //entityManager.persist(patient);
	}

}
