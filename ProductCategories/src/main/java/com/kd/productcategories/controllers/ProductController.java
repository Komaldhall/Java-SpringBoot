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
public class ProductController {
	private final ProductServices pS;
	private final CategoryServices cS;
	private final CategoryProductServices cPS;
	
	public ProductController(ProductServices pS, CategoryServices cS, CategoryProductServices cPS) {
		this.pS = pS;
		this.cS = cS;
		this.cPS = cPS;
	}
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("products") Product products) {
		return "/products/index.jsp";
	}
	@PostMapping("/products")
	public String create(@ModelAttribute("products") Product products) {
		Product p=pS.createProduct(products);
		return "redirect:/products/" + p.getId();
	}
	@GetMapping("/products/{productId}")
	public String show(@PathVariable("productId") Long productId, Model model) {
		Product p=pS.findById(productId);
		List<Category> c=cS.findAllCategory();
		List<Category> cp= p.getCategories();
		for(int i=0; i<cp.size() ; i++)
		{
			System.out.println(cp.get(i));
			c.remove(cp.get(i));
		}
		
		model.addAttribute("product", p);
		model.addAttribute("allcategories", c);
		return "/products/show.jsp";
		
		
	}
	
	@PostMapping("/products/{productId}")
	public String create(@PathVariable("productId") Long productId, @RequestParam("categoryId") Long categoryId){
		Product p=pS.findById(productId);
		Category c=cS.findById(categoryId);	
		CategoryProduct cps = new CategoryProduct();
		cps.setCategory(c);
		cps.setProduct(p);
		cPS.createCategoryProduct(cps);
		
		return "redirect:/products/"+productId;
		
		
	}
	

}
