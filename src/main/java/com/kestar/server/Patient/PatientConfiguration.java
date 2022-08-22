package com.kestar.server.Patient;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kestar.server.doctor.Doctor;
import com.kestar.server.doctor.DoctorRepository;

@Configuration
public class PatientConfiguration {
	@Bean
	CommandLineRunner patientcommandLineRunner(PatientRepository repo) {
		return args->{
			Patient dc1 = new Patient("hellomaroc","black@kestar.com", "maroc2020", "hellomaroc") ;
			Patient dc2 = new Patient("marochello","kestar@kestar.com", "google2020", "marochello") ; 
			repo.saveAll(List.of(dc1 , dc2)) ; 
		}; 
		
	}
}
