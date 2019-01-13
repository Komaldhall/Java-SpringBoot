package com.kd.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kd.languages.models.Languages;
import com.kd.languages.services.LanguageService;



@Controller
public class LanguagesController {
	private final LanguageService lS;

	public LanguagesController(LanguageService lS) {
		this.lS = lS;
	}
	@RequestMapping("/languages")
    public String index(Model model, @ModelAttribute("language") Languages lang) {
        List<Languages> langu = lS.allLanguages();
        model.addAttribute("lang", langu);
        return "/index.jsp";
    }
	@RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Languages lang, BindingResult result) {
        if (result.hasErrors()) {
            return "/index.jsp";
        } else {
            lS.createLanguages(lang);
            return "redirect:/languages";
        }
    }
	@RequestMapping(value="/languages/{id}", method=RequestMethod.GET)
    public String showBook(Model model, @PathVariable("id") Long id) {
	 	Languages lang = lS.findLanguages(id);
    	model.addAttribute("lang", lang);
        return "/dashboard.jsp";

	}
	@RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model, @ModelAttribute("language") Languages lang) {
		Languages langu = lS.findLanguages(id);
		model.addAttribute("lang", langu);
        return "/edit.jsp";
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Languages lang, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            lS.updateLanguages(lang.getId(),lang.getName(),lang.getCreater(),lang.getCurrentVersion());
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        lS.deleteLanguages(id);
        return "redirect:/languages";
    }
	
	
	
	
	
	
	

	
	
}
