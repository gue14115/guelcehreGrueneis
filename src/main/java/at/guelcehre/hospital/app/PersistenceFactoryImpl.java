package at.guelcehre.hospital.app;

import at.guelcehre.hospital.domain.Operation;
import at.guelcehre.hospital.domain.Patient;
import at.guelcehre.hospital.repositoryjpa.*;

import javax.persistence.EntityManager;
import java.util.HashMap;

/**
 * Created by Anil on 16.01.14.
 */
public class PersistenceFactoryImpl implements PersistenceFactory{

    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();

    public PersistenceFactoryImpl(EntityManager entityManager){
        DoctorJpaRepository  doctorJpaRepository = new DoctorJpaRepository();
        doctorJpaRepository.setEntityManager(entityManager);
        repositories.put(DoctorJpaRepository.class,doctorJpaRepository);

        OperationJpaRepository operationJpaRepository = new OperationJpaRepository();
        operationJpaRepository.setEntityManager(entityManager);
        repositories.put(OperationJpaRepository.class,operationJpaRepository);

        PatientJpaRepository patientJpaRepository = new PatientJpaRepository();
        patientJpaRepository.setEntityManager(entityManager);
        repositories.put(PatientJpaRepository.class,patientJpaRepository);

        PersonJpaRepository personJpaRepository = new PersonJpaRepository();
        personJpaRepository.setEntityManager(entityManager);
        repositories.put(PersonJpaRepository.class,personJpaRepository);

        RoomJpaRepository roomJpaRepository = new RoomJpaRepository();
        roomJpaRepository.setEntityManager(entityManager);
        repositories.put(RoomJpaRepository.class,roomJpaRepository);
    }

    @Override
    public DoctorJpaRepository doctorJpaRepository() {
        return (DoctorJpaRepository)repositories.get(DoctorJpaRepository.class);
    }

    @Override
    public OperationJpaRepository operationJpaRepository() {
        return (OperationJpaRepository)repositories.get(OperationJpaRepository.class);
    }

    @Override
    public PatientJpaRepository patientJpaRepository() {
        return (PatientJpaRepository)repositories.get((PatientJpaRepository.class));
    }

    @Override
    public PersonJpaRepository personJpaRepository() {
        return (PersonJpaRepository)repositories.get((PersonJpaRepository.class));
    }

    @Override
    public RoomJpaRepository roomJpaRepository() {
        return (RoomJpaRepository)repositories.get((RoomJpaRepository.class));
    }
}
