package com.kd.displaydate;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller

public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	@RequestMapping("/")
	public String Home(Model model) {
		model.addAttribute("datetemplate", "Date template");
		model.addAttribute("timetemplate", "Time template");
		return "index.jsp";
	}
	@RequestMapping("date")
	public String Date(Model model) {
		java.util.Date date = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");
		model.addAttribute("date", dateFormat.format(date));
		return "date.jsp";
		
	}
	@RequestMapping("time")
	public String Time(Model model) {
		java.util.Date date = new java.util.Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
		
		model.addAttribute("time", timeFormat.format(date));
		return "time.jsp";
		
	}
	
}
