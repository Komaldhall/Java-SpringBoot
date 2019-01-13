package com.kd.dojosninjas.services;


import org.springframework.stereotype.Service;

import com.kd.dojosninjas.models.Ninja;
import com.kd.dojosninjas.repositories.NinjaRepo;


@Service
public class NinjaServices {
private final NinjaRepo nR;
	
	public NinjaServices(NinjaRepo nR) {
		this.nR = nR;
	}
	public Ninja createNinja(Ninja ninja) {
        return nR.save(ninja);
    }
	

}
