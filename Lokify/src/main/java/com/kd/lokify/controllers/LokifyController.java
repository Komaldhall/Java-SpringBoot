package com.kd.lokify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.lokify.models.Lokify;
import com.kd.lokify.services.LokifyService;



@Controller
public class LokifyController {
	private final LokifyService lS;

	public LokifyController(LokifyService lS) {
		this.lS = lS;
	}
	@RequestMapping("/lokify")
    public String index() {
        return "/index.jsp";
    }
	@RequestMapping("/dashboard")
    public String index(Model model, @ModelAttribute("lokify") Lokify lok) {
        List<Lokify> loki = lS.allBooks();
        model.addAttribute("loki", loki);
        return "/dashboard.jsp";
    }
	
	@RequestMapping(value="/songs/{id}", method=RequestMethod.GET)
    public String showBook(Model model, @PathVariable("id") Long id) {
	 	Lokify loki = lS.findBook(id);
    	model.addAttribute("loki", loki);
        return "/show.jsp";

	}
	@RequestMapping("/songs/new")
    public String newsong(@ModelAttribute("lokify") Lokify lok) {
		return "/new.jsp";
    }
	@RequestMapping(value="/dashboard", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("lokify") Lokify lok, BindingResult result) {
        if (result.hasErrors()) {
            return "/dashboard.jsp";
        } else {
            lS.createBook(lok);
            return "redirect:/dashboard";
        }
    }
	@RequestMapping("/search/topTen")
    public String topten(Model model, @ModelAttribute("lokify") Lokify lok) {
        List<Lokify> loki = lS.findTop10ByOrderByRatingDesc();
        model.addAttribute("loki", loki);
        return "/topten.jsp";
    }
	@RequestMapping(value="/songs/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        lS.deleteBook(id);
        return "redirect:/dashboard";
    }
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String showArtist(Model model, @RequestParam("artist") String artist) {
		List<Lokify> loki = lS.findByArtist(artist);
		model.addAttribute("loki", loki);
	    return "/artist.jsp";
	
	}
}
