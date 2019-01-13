package com.kd.cemployeemanagers.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.cemployeemanagers.models.Employees;
import com.kd.cemployeemanagers.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	private final EmployeeRepo eR;
	
	public EmployeeService(EmployeeRepo eR) {
		this.eR = eR;
	}

	public void save(Employees m) {
		// TODO Auto-generated method stub
		eR.save(m);
	}

	public Employees findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employees> optionalEmp=eR.findById(id);
		if(optionalEmp.isPresent()) {
			return optionalEmp.get();
			
		}
		else {
			return null;
		}
		
	}

}
