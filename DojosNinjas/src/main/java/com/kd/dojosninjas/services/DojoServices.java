package com.kd.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.dojosninjas.models.Dojo;

import com.kd.dojosninjas.repositories.DojoRepo;

@Service
public class DojoServices {
	private final DojoRepo dR;
	
	public DojoServices(DojoRepo dR) {
		this.dR = dR;
	}
	public Dojo createDojo(Dojo dojo) {
        return dR.save(dojo);
    }
	public List<Dojo> findAllDojo() {
		// TODO Auto-generated method stub
		return dR.findAll();
	}
	
	public Dojo findById(Long dojoId) {
		// TODO Auto-generated method stub
		Optional<Dojo> optionalDojo=dR.findById(dojoId);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
			
		}
		else {
			return null;
		}
		
	}
	
	

}
