package com.kd.relationship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.relationship.models.Person;
import com.kd.relationship.repositories.PersonRepo;

@Service
public class PersonServices {
	private final PersonRepo pR;

	public PersonServices(PersonRepo pR) {
		this.pR = pR;
	}
	
	public Person createPerson(Person person) {
		return pR.save(person);
	}
	public Person findPerson(Long personId) {
		Optional<Person> optionalPerson = pR.findById(personId);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
			
		}
		else {
			return null;
		}
		
	}
	
	public List<Person> findAllPerson(){
		return pR.findAll();
	}
}
