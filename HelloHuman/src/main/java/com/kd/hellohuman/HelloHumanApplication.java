package com.kd.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class HelloHumanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index(@RequestParam(value="fname", required=false, defaultValue="Human") String fname, @RequestParam(value="lname", required=false, defaultValue="Being") String lname) {
		
		return "Hello " + fname + " " + lname + "! Welcome to SpringBoot!";
	
    }
}
