package com.kd.relationship.controllers;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.relationship.models.License;
import com.kd.relationship.services.LicenseServices;
import com.kd.relationship.services.PersonServices;
@Controller
public class LicenseController {
	private final LicenseServices lS;
	private final PersonServices pR;


	public LicenseController(LicenseServices lS, PersonServices pR) {
		this.lS = lS;
		this.pR = pR;
	}


	@GetMapping("/licenses/new")
    public String index(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("allperson", pR.findAllPerson());
        return "/license/index.jsp";
    }
	
	@PostMapping("/licenses")
	public String create(@Valid  @ModelAttribute("license") License license, BindingResult result, @RequestParam("expDate") String expiration_date) throws ParseException {
		if(result.hasErrors()) {
			return "/license/index.jsp";
		}
		else {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
			Date date=(Date)format.parse(expiration_date);
			license.setExpiration_date(date);
			Long number=license.getPerson().getId();  
	        String numb = String.format("%06d", number);
	        System.out.println(numb);
			license.setNumber(numb);
			License lice=lS.createLicense(license);
			System.out.println(lice.getNumber());
			
			
			return "redirect:/persons/" + lice.getPerson().getId();
		}
		
	}


	
	
	
	

}
