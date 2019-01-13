package com.kd.countries.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kd.countries.models.Cities;
import com.kd.countries.models.Countries;
import com.kd.countries.models.Languages;
import com.kd.countries.services.ApiService;
@Controller
public class ApiController {
	private final ApiService aS;
	
	
	public ApiController(ApiService aS) {
		this.aS = aS;
	}
	@RequestMapping("/")
//	public String query(Model model) {
//		List<Object[]> table = aS.joincountriesAndcities();
//		for(Object[] row : table) {
//		    Countries country = (Countries) row[0];
//		    Cities city = (Cities) row[1];
//		    System.out.println(country.getName());
//		    System.out.println(city.getName());
//		}
//		model.addAttribute("table",table);
//		return "show.jsp";
//	}
//  **********In show.jsp...use this
//	<table class="table">
//    <thead>
//    	<tr>
//	        <th>Country Name</th>
//	        <th>City Name</th>
//	    </tr>
//      
//    </thead>
//    <tbody>
//        <c:forEach var="row" items="${table}">                
//        <tr>
//            <td>${row[0].name}</td>
//            <td>${row[1].name}</td>
//        </tr>
//        </c:forEach>
//    </tbody>
//</table>
	public String query(Model model) {
		// Query 1
		String lang="Slovene";
		List<Object[]> table1 = aS.joincountriesAndlanguages(lang);
		model.addAttribute("table1",table1);
		
		//Query 2
		
		List<Object[]> table2 = aS.joincountriesAndcities();
		model.addAttribute("table2",table2);
		
		//Query 3
		String count="Mexico";
		List<Object[]> table3 = aS.joincountriesAndcities(count);
		model.addAttribute("table3",table3);
		
		//Query 4
		
		List<Object[]> table4 = aS.joincountriesAndlanguages();
		model.addAttribute("table4",table4);
		
		//Query 5
		
		List<Object[]> table5 = aS.countriessurface();
		model.addAttribute("table5",table5);
		
		//Query 6
		String cons="Constitutional Monarchy";
		
		List<Object[]> table6 = aS.countriesGovForm(cons);
		model.addAttribute("table6",table6);
		
		//Query 7
		String cont="Argentina";
		String dist="Buenos Aires";
		
		List<Object[]> table7 = aS.countriesAndcities(cont,dist);
		model.addAttribute("table7",table7);
		
		//Query 8
		
		List<Object[]> table8 = aS.countriesRegion();
		model.addAttribute("table8",table8);
				
				
		
		return "show.jsp";
	
	
	
	
	}
	
}
