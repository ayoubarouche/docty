package com.kestar.server.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/doctors")
@CrossOrigin("*")
public class DoctorController {
		private final DoctorService doctorService ; 
		
	@Autowired
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}



	
	
	@GetMapping()
	public List<Doctor> getDoctors() {
		
		
		return this.doctorService.getDoctors();
	}
	
	@GetMapping("{address}")
	
	public Doctor getDoctor(@PathVariable("address") String address ) {
		Doctor dc1 = new Doctor("helloworld","arouche@kestar.com", "maroc2020", "helloworld") ;
		return dc1 ;
	}
	
	

}
