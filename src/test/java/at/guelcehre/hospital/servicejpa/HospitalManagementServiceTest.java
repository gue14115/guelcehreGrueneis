package at.guelcehre.hospital.servicejpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by anil on 10/03/14.
 */
@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class HospitalManagementServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    HospitalManagementServiceJpa hospitalManagementServiceJpa;

    @Test
    public void aTest() {
        Assert.assertNotNull(hospitalManagementServiceJpa);
    }
}
