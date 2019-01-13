package com.kd.productcategories.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kd.productcategories.models.Category;
import com.kd.productcategories.models.CategoryProduct;
import com.kd.productcategories.models.Product;
import com.kd.productcategories.services.CategoryProductServices;
import com.kd.productcategories.services.CategoryServices;
import com.kd.productcategories.services.ProductServices;


@Controller
public class CategoryController {
	private final CategoryServices cS;
	private final ProductServices pS;
	private final CategoryProductServices cPS;
	public CategoryController(ProductServices pS, CategoryServices cS, CategoryProductServices cPS) {
		this.pS = pS;
		this.cS = cS;
		this.cPS = cPS;
	}
	@RequestMapping("/categories/new")
	public String newPerson(@ModelAttribute("categories") Category categories) {
		return "/categories/index.jsp";
	}
	@PostMapping("/categories")
	public String create(@ModelAttribute("categories") Category categories) {
		Category c=cS.createCategory(categories);
		return "redirect:/categories/" + c.getId();
	}
	@GetMapping("/categories/{categoryId}")
	public String show(@PathVariable("categoryId") Long categoryId, Model model) {
		Category c=cS.findById(categoryId);
		List<Product> p=pS.findAllProduct();
		List<Product> pc= c.getProducts();
		for(int i=0; i<pc.size() ; i++)
		{
			System.out.println(pc.get(i));
			p.remove(pc.get(i));
		}
		
		model.addAttribute("category", c);
		model.addAttribute("allproduct", p);
		return "/categories/show.jsp";
		
	
	}
	
	@PostMapping("/categories/{categoryId}")
	public String create(@PathVariable("categoryId") Long categoryId, @RequestParam("productId") Long productId){
		Category c=cS.findById(categoryId);
		Product p=pS.findById(productId);	
		CategoryProduct cps = new CategoryProduct();
		cps.setCategory(c);
		cps.setProduct(p);
		cPS.createCategoryProduct(cps);
		
		return "redirect:/categories/"+categoryId;
		
		
	}
	
}
