package at.guelcehre.hospital.webapp;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by anil on 07/04/14.
 */
@WebFilter(value = "/web/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "at.guelcehre.hospital.webapp.HospitalManagementApplication"),
        @WebInitParam(name = "filterMappingUrlPattern", value = "/web/*")})
public class HospitalManagementFilter extends WicketFilter{
}
