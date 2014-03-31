package at.guelcehre.hospital.rest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by anil on 21/03/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
@WebAppConfiguration
public class DoctorApiTest {
    @Resource
    private WebApplicationContext webApplicationContext;

    @Test
    public void readFromEmptyListOfDoctors() throws Exception {
        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(get("/doctors")).
                andExpect(status().isOk());
    }

    @Test
    public void insertNewDoctor() throws Exception {

        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/doctors").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"qualification\":\"Dr\", \"specialization\":\"Cancer\"}")).
                andExpect(status().isCreated());
    }
}
