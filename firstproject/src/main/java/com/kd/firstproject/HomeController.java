package com.kd.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String Home(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}

}
