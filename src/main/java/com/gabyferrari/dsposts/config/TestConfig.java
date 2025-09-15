package com.gabyferrari.dsposts.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gabyferrari.dsposts.models.entities.User;
import com.gabyferrari.dsposts.repositories.UserRepository;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void init() {
		repository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		repository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
