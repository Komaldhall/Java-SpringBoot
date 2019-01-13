package com.kd.dojosninjas.controllers;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kd.dojosninjas.models.Dojo;
import com.kd.dojosninjas.services.DojoServices;


@Controller
public class DojoController {
	private final DojoServices dS;
	
	
	public DojoController(DojoServices dS) {
		this.dS = dS;
	}
	@RequestMapping("/dojos/new")
	public String newPerson(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/index.jsp";
	}
	@PostMapping("/dojos")
	public String create(@ModelAttribute("dojo") Dojo dojo) {
		Dojo d=dS.createDojo(dojo);
		return "redirect:/dojos/" + d.getId();
		
		
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String show(@PathVariable("dojoId") Long dojoId, Model model) {
		Dojo d=dS.findById(dojoId);
		model.addAttribute("dojo", d);
		return "/dojos/show.jsp";
		
	}

}
