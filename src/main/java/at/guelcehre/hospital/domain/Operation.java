package at.guelcehre.hospital.domain;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import at.guelcehre.hospital.Ensure;

@Entity
@Table(name = "operations")
public class Operation extends BasePersistable{

    private static final long serialVersionUID = 1766209272109267427L;

    @NotNull
    @Column(name = "start", nullable = false, length = 255)
    private GregorianCalendar start;

    @NotNull
    @Column(name = "end", nullable = false, length = 255)
    private GregorianCalendar end;

    @NotNull
    @Column(name = "estimated_length_in_hours", nullable = false, length = 255)
    private int estimatedLengthInHours;

    @NotNull
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="patient")
    private Patient patient;

    @NotNull
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="doctor")
    private Doctor doctor;

    @NotNull
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="room")
    private Room room;

    public Operation(){
        // required for JPA
    }
    public Operation(GregorianCalendar start, GregorianCalendar end,
                     int estimatedLengthInHours, Patient patient, Doctor doctor,
                     Room room) {
        super();
        Ensure.notNull("start",start);
        Ensure.notNull("end",end);
        Ensure.notNull("estimated_length_in_hours",estimatedLengthInHours);
        Ensure.notNull("patient",patient);
        Ensure.notNull("doctor",doctor);
        Ensure.notNull("room",room);
        this.start = start;
        this.end = end;
        this.estimatedLengthInHours = estimatedLengthInHours;
        this.patient = patient;
        this.doctor = doctor;
        this.room = room;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public GregorianCalendar getStart() {
        return start;
    }

    public void setStart(GregorianCalendar start) {
        this.start = start;
    }

    public GregorianCalendar getEnd() {
        return end;
    }

    public void setEnd(GregorianCalendar end) {
        this.end = end;
    }

    public int getEstimatedLengthInHours() {
        return estimatedLengthInHours;
    }

    public void setEstimatedLengthInHours(int estimatedLengthInHours) {
        this.estimatedLengthInHours = estimatedLengthInHours;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
