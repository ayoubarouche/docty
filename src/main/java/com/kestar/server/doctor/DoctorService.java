package com.kestar.server.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	
	private final DoctorRepository doctorRepository ; 
	
	@Autowired
public DoctorService(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

public List<Doctor> getDoctors() {
		
		
		return this.doctorRepository.findAll();
	}

}
