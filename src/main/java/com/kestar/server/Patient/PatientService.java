package com.kestar.server.Patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	
	private final PatientRepository patientRepository ;

	@Autowired
	public PatientService(PatientRepository patientRepository) {
	
		this.patientRepository = patientRepository;
	} 
	
	public List<Patient> getPatients(){
		return this.patientRepository.findAll();
	}
	

}
