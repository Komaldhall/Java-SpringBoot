package com.kd.relationship.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.relationship.models.Person;
@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
	List<Person> findAll();

}
