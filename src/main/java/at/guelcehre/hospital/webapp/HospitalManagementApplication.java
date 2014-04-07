package at.guelcehre.hospital.webapp;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by anil on 07/04/14.
 */
public class HospitalManagementApplication extends WebApplication{
    @Override
    public Class<? extends Page> getHomePage() {
        return HospitalManagementPage.class;
    }
}
