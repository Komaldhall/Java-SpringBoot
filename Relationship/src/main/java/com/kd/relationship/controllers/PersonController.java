package com.kd.relationship.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kd.relationship.models.Person;
import com.kd.relationship.services.PersonServices;
@Controller
public class PersonController {
	private final PersonServices pS;
	
	public PersonController(PersonServices pS) {
		this.pS = pS;
	}
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("persons") Person person) {
		return "/person/index.jsp";
	}
	@PostMapping("/persons")
	public String create(@Valid  @ModelAttribute("persons") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/person/index.jsp";
		}
		else {
			Person per=pS.createPerson(person);
			return "redirect:/persons/" + per.getId();
		}
		
	}
	
	@GetMapping("/persons/{personId}")
	public String show(@PathVariable("personId") Long personId, Model model) {
		Person per=pS.findPerson(personId);
		model.addAttribute("person", per);
		return "/person/show.jsp";
		
	}
}

