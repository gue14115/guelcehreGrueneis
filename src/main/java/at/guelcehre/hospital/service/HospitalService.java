package at.guelcehre.hospital.service;

import at.guelcehre.hospital.domain.Doctor;
import at.guelcehre.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by anil on 21/03/14.
 */
@Service
public class HospitalService {
    @Autowired
    private DoctorRepository doctorRepository;

    public void createNewDoctor(String name, Date birthDate, boolean isMan,
                                String telephoneNumber, String address, String zip,
                                String qualification, String specialization){
        Doctor doctor = new Doctor(name, birthDate, isMan, telephoneNumber, address, zip, qualification, specialization);
        doctorRepository.save(doctor);
    }
}
