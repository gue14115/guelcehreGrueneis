package at.guelcehre.hospital.webapp;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by anil on 07/04/14.
 */
public class HospitalManagementPage extends WebPage{
    private Component headerPanel;
    private Component navigationPanel;
    private Component contentPanel;
    private Component footerPanel;

    public HospitalManagementPage(){
        add(new Label("helloMessage", "Hello WicketWorld!"));
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(navigationPanel = new NavigationPanel("navigationPanel"));
        add(contentPanel = new ContentPanel("contentPanel"));
        add(footerPanel = new FooterPanel("footerPanel"));
    }
}
