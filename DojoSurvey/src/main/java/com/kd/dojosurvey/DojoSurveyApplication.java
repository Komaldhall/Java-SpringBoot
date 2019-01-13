package com.kd.dojosurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DojoSurveyApplication {
	private String languages="";
	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	@RequestMapping("/")
	public String index(){
		System.out.println(languages);
		if(languages.equals("java")) {
			languages="";
			return "java.jsp";
		}
		
		return "index.jsp";
		
	}
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String result(@RequestParam(value="name") String name,@RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="message") String message, Model model){
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("message", message);
		languages=language;
//		System.out.println(languages);
		return "result.jsp";
	}
	
	
}
