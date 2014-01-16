package at.guelcehre.hospital.repositoryjpa;

/**
 * Created by Anil on 16.01.14.
 */
public interface PersistenceFactory {

    DoctorJpaRepository doctorJpaRepository();

    OperationJpaRepository operationJpaRepository();

    PatientJpaRepository patientJpaRepository();

    PersonJpaRepository personJpaRepository();

    RoomJpaRepository  roomJpaRepository();
}
