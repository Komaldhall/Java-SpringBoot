package com.kd.ninjagold;

import java.util.ArrayList;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class NinjaGoldApplication {
	private int gold=0;
	private int number=0;
	private String error="";
	private ArrayList<String> message= new ArrayList<String>();;		
	 
	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("gold",gold);
		
		return "index.jsp";	
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="name") String name, HttpSession session){
		Random rand = new Random();
		
		if (name.equals("farm")) {
			number = rand.nextInt(10) + 11;
			gold+=number;
			error="You earned "+number+" gold from farm.";
			
		}
		else if (name.equals("cave")) {
			number = rand.nextInt(5) + 11;
			gold+=number;
			error="You earned "+number+" gold from cave.";
		}
		else if(name.equals("house")) {
			number = rand.nextInt(2) + 6;
			gold+=number;	
			error="You earned "+number+" gold from house.";
		}
		else if(name.equals("casino")) {
			number = rand.nextInt(101)-50;
			gold+=number;
			if(number<0) {
				number=-number;
				error="You lost "+number+" gold in casino.";
			}
			else {
				error="You earned "+number+" gold in casino.";
			}
			
		}

		message.add(0,error);
		session.setAttribute("error", message);
		
		return "redirect:/";	
	}
}
