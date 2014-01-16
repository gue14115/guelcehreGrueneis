package at.guelcehre.hospital.servicejpa;

/**
 * Interface for the 'abstract factory' to be used for providing all services. This approach is required when not using
 * e.g. Spring.
 */
public interface ServiceJpaFactory {
    HospitalManagmentServiceJpa hospitalManagmentServiceJpa();
}
