package com.kd.lokify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.lokify.models.Lokify;


@Repository
public interface LokifyRepo extends CrudRepository<Lokify, Long> {
	
    List<Lokify> findAll();
   
    List<Lokify> findTop10ByOrderByRatingDesc();
    
    List<Lokify> findByArtist(String artist);
	

}