package at.guelcehre.hospital.service;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by anil on 21/03/14.
 */

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class HospitalServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    HospitalService hospitalService;

    @Test
    public void aTest(){
        Assert.assertNotNull(hospitalService);
    }
}
