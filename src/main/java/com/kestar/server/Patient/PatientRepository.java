package com.kestar.server.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kestar.server.doctor.Doctor;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, String> {

}
