package com.kestar.server.doctor;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DoctorConfiguration {
	@Bean
	CommandLineRunner commandLineRunner(DoctorRepository repo) {
		return args->{
			Doctor dc1 = new Doctor("helloworld","arouche@kestar.com", "maroc2020", "helloworld") ;
			Doctor dc2 = new Doctor("worldhello","ayoub@kestar.com", "google2020", "worldhello") ; 
			repo.saveAll(List.of(dc1 , dc2)) ; 
		}; 
		
	}


}
