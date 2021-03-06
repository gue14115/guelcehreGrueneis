package at.guelcehre.hospital.domain;

import at.guelcehre.hospital.Ensure;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "rooms")
public class Room extends BasePersistable{

    private static final long serialVersionUID = -3156916839316342870L;
    @NotNull
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @NotNull
    @Column(name = "building", nullable = false, length = 255)
    private String building;
    @NotNull
    @Column(name = "floor", nullable = false, length = 255)
    private String floor;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "patient")
    private Patient patient;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "doctor")
    private Doctor doctor;

    public Room(){
        // required for JPA
    }

    public Room(String name, String building, String floor, Patient patient, Doctor doctor){
        Ensure.notEmpty("name", name);
        Ensure.notEmpty("building",building);
        Ensure.notEmpty("floor",floor);
        Ensure.notNull("patient", patient);
        Ensure.notNull("doctor", doctor);
        this.name = name;
        this.building = building;
        this.floor = floor;
        this.patient = patient;
        this.doctor = doctor;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
