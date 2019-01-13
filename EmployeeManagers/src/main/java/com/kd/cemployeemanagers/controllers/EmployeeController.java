package com.kd.cemployeemanagers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kd.cemployeemanagers.models.Employees;
import com.kd.cemployeemanagers.services.EmployeeService;

@Controller
public class EmployeeController {
	private final EmployeeService eS;
	
	public EmployeeController(EmployeeService eS) {
		this.eS = eS;
	}

	@RequestMapping("/")
	public void employee() {
		Employees m =  new Employees();
		m.setFirstName("Manager");
		m.setLastName("Manager");
		eS.save(m);
		Employees e = new Employees();
		e.setFirstName("Developer");
		e.setLastName("Developer");
		
		e.setManager(m);
		eS.save(e);
		
		Employees em = eS.findById(e.getId());
//		System.out.println("Employee : "+em.getFirstName());
//		
//		System.out.println("Manager : "+em.getManager().getFirstName());
		
		for(Employees emp : em.getEmployees()) {
	        System.out.println(emp);
	    }
		
	   
//	    // This will print out the first name of users 2 and 3. All the users that are user's friends
//	    for(User u : user.getFriends()) {
//	        System.out.println(u.getFirstName());
//	    }
//	    
//	    // This will only print out the first name of user 2.
//	    for(User u : user.getUserFriends()) {
//	        System.out.println(u.getFirstName());
//	    }
	}

}
