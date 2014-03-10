package at.guelcehre.hospital.servicejpa;

import at.guelcehre.hospital.repositoryjpa.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * All uses cases for the timetable management.
 */
@Service
public class HospitalManagementServiceJpa {

    @Autowired
    private DoctorJpaRepository doctorJpaRepository;

    @Autowired
    private OperationJpaRepository operationJpaRepository;

    @Autowired
    private PatientJpaRepository patientJpaRepository;

    @Autowired
    private PersonJpaRepository personJpaRepository;

    @Autowired
    private RoomJpaRepository roomJpaRepository;

    public void setDoctorJpaRepository(DoctorJpaRepository doctorJpaRepository) {
        this.doctorJpaRepository = doctorJpaRepository;
    }

    public void setOperationJpaRepository(OperationJpaRepository operationJpaRepository) {
        this.operationJpaRepository = operationJpaRepository;
    }

    public void setPatientJpaRepository(PatientJpaRepository patientJpaRepository) {
        this.patientJpaRepository = patientJpaRepository;
    }

    public void setPersonJpaRepository(PersonJpaRepository personJpaRepository) {
        this.personJpaRepository = personJpaRepository;
    }

    public void setRoomJpaRepository(RoomJpaRepository roomJpaRepository) {
        this.roomJpaRepository = roomJpaRepository;
    }
}
