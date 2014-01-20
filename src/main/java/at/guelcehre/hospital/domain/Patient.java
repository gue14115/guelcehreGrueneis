package at.guelcehre.hospital.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import at.guelcehre.hospital.Ensure;

@Entity
@DiscriminatorValue("P")
public class Patient extends Person{
    @Column(name = "sickness")
    private String sickness;

    public Patient(){
        // required for JPA
    }

    public Patient(String name, Date birthDate, boolean isMan,
                   String telephoneNumber, String address, String zip, String sickness) {
        super(name, birthDate, isMan, telephoneNumber, address, zip);
        Ensure.notEmpty("sickness", sickness);
        this.sickness = sickness;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }
}
