package com.kestar.server.Patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patients")
@CrossOrigin("*")
public class PatientController {
	
	private final PatientService patientService ; 
	
	@Autowired
	public PatientController(PatientService patientService) {
		
		this.patientService = patientService;
	}


	@GetMapping
	public List<Patient> getPatients(){
		return patientService.getPatients();
	}
	

}
