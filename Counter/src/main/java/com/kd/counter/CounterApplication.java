package com.kd.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class CounterApplication {
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session){
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			session.setAttribute("count", 0);
		} else {
			count=count+1;
			session.setAttribute("count", count);	
		}
		Integer second = (Integer) session.getAttribute("second");
		if(second != null) {
			Integer counts = (Integer) session.getAttribute("count");
			counts=counts+1;
			session.setAttribute("count", counts);
			session.setAttribute("second", null);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String Counter() {
		return "counter.jsp";
	}
	
	@RequestMapping("/countertwo")
	public String Double(HttpSession session) {
		Integer second = 1;
		session.setAttribute("second", second);	
			
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);	
		session.setAttribute("second", 0);
		return "redirect:/";
	}
	
	
	
}
