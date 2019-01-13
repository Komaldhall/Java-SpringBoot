package com.kd.lokify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.lokify.models.Lokify;
import com.kd.lokify.repositories.LokifyRepo;



@Service
public class LokifyService {
	private final LokifyRepo lR;
	
	public LokifyService(LokifyRepo lR) {
		
		this.lR = lR;
	}
	public List<Lokify> allBooks() {
        return lR.findAll();
    }
	public List<Lokify> findTop10ByOrderByRatingDesc(){
		return lR.findTop10ByOrderByRatingDesc();
	}
	public List<Lokify> findByArtist(String artist){
		return lR.findByArtist(artist);
	}
	public Lokify createBook(Lokify l) {
        return lR.save(l);
    }
	public Lokify findBook(Long id) {
        Optional<Lokify> optionallokify = lR.findById(id);
        if(optionallokify.isPresent()) {
            return optionallokify.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
		Optional<Lokify> optionallokify = lR.findById(id);
        if(optionallokify.isPresent()) {
        	lR.deleteById(id);
        }
		
		
	}
	public Lokify updateBook(Long id, String title, String artist, Integer rating) {
		Optional<Lokify> optionallokify = lR.findById(id);
		if(optionallokify.isPresent()) {
			Lokify lok= optionallokify.get();
			lok.setTitle(title);
			lok.setArtist(artist);
			lok.setRating(rating);
			
			return lR.save(lok);
			
        } else {
            return null;
        }
	}

}
