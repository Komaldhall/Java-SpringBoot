package com.kd.languages.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.languages.models.Languages;



@Repository
public interface LanguageRepo extends CrudRepository<Languages, Long> {
	
    List<Languages> findAll();
	

}
