package com.kd.auth.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.auth.models.User;
import com.kd.auth.services.UserService;
import com.kd.auth.validator.UserValidator;

@Controller
public class Users {
	 	private UserService userService;
	 	private UserValidator userValidator;
	 	public Users(UserService userService, UserValidator userValidator) {
	        this.userService = userService;
	        this.userValidator = userValidator;
	    }
	    @RequestMapping("/registration")
	    public String registerForm(@Valid @ModelAttribute("user") User user) {
	        return "registrationPage.jsp";
	    }
	    
	
	    @RequestMapping("/login")
	    public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
	        if(error != null) {
	            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
	        }
	        if(logout != null) {
	            model.addAttribute("logoutMessage", "Logout Successful!");
	        }
	        return "loginPage.jsp";
	    }
	  
	    @RequestMapping(value = {"/", "/home"})
	    public String home(Principal principal, Model model) {
	        String username = principal.getName();
	        model.addAttribute("currentUser", userService.findByUsername(username));
	        return "homePage.jsp";
	    }
	    @PostMapping("/registration")
	    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
	        userValidator.validate(user, result);
	        if (result.hasErrors()) {
	            return "registrationPage.jsp";
	        }
	        userService.saveUserWithAdminRole(user);
	        return "redirect:/login";
	    }
	     
	    @RequestMapping("/admin")
	    public String adminPage(Principal principal, Model model) {
	        String username = principal.getName();
	        model.addAttribute("currentUser", userService.findByUsername(username));
	        return "adminPage.jsp";
	    }
    
}
