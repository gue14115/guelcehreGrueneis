package at.guelcehre.hospital.app;

import at.guelcehre.hospital.repositoryjpa.PersistenceFactory;
import at.guelcehre.hospital.servicejpa.HospitalManagmentServiceJpa;
import at.guelcehre.hospital.servicejpa.ServiceJpa;
import at.guelcehre.hospital.servicejpa.ServiceJpaFactory;

import java.util.HashMap;

/**
 * Created by Anil on 16.01.14.
 */
public class ServiceFactoryImpl implements ServiceJpaFactory {

private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

    @Override
    public HospitalManagmentServiceJpa hospitalManagmentServiceJpa(){
        HospitalManagmentServiceJpa hospitalManagmentServiceJpa = new HospitalManagmentServiceJpa();
        hospitalManagmentServiceJpa.setDoctorJpaRepository(persistenceFactory.doctorJpaRepository());
        hospitalManagmentServiceJpa.setOperationJpaRepository(persistenceFactory.operationJpaRepository());
        hospitalManagmentServiceJpa.setPatientJpaRepository(persistenceFactory.patientJpaRepository());
        hospitalManagmentServiceJpa.setPersonJpaRepository(persistenceFactory.personJpaRepository());
        hospitalManagmentServiceJpa.setRoomJpaRepository(persistenceFactory.roomJpaRepository());
        return hospitalManagmentServiceJpa;
    }
}
