package at.guelcehre.hospital.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import at.guelcehre.hospital.Ensure;

@Entity
@DiscriminatorValue("D")
@Table(name="doctors")
public class Doctor extends Person{

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "specialization")
    private String specialization;

    public Doctor(){
        // required for JPA
    }

    public Doctor(String name, Date birthDate, boolean isMan,
                  String telephoneNumber, String address, String zip,
                  String qualification, String specialization) {
        super(name, birthDate, isMan, telephoneNumber, address, zip);
        Ensure.notEmpty("qualification", qualification);
        Ensure.notEmpty("specialization", specialization);
        this.qualification = qualification;
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
