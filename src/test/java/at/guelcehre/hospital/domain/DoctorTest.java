package at.guelcehre.hospital.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class DoctorTest {
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
        Doctor doctor = new Doctor("Anil",d,true,"100000","Joseph 7","1120 Wien","Everything","Neurology");
        entityManager.persist(doctor);
	}

}
