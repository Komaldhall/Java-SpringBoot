package com.kd.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.kd.dojosninjas.models.Ninja;
import com.kd.dojosninjas.services.DojoServices;
import com.kd.dojosninjas.services.NinjaServices;


@Controller
public class NinjaController {
	private final NinjaServices nS;
	private final DojoServices dS;
	public NinjaController(NinjaServices nS, DojoServices dS) {
	
		this.nS = nS;
		this.dS = dS;
	}

	@GetMapping("/ninjas/new")
    public String index(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("alldojo", dS.findAllDojo());
        return "/ninjas/index.jsp";
    }
	
	@PostMapping("/ninjas")
	public String create(@Valid  @ModelAttribute("ninja") Ninja ninja, BindingResult result){
		if(result.hasErrors()) {
			return "/ninjas/index.jsp";
		}
		else {
			Ninja nin=nS.createNinja(ninja);
			
			return "redirect:/dojos/" + nin.getDojo().getId();
		}
		
	}
}
