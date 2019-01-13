package com.kd.productcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.productcategories.models.Category;
import com.kd.productcategories.repositories.CategoryRepo;

@Service
public class CategoryServices {
	private final CategoryRepo cR;

	public CategoryServices(CategoryRepo cR) {
		this.cR = cR;
	}

	public Category createCategory(Category categories) {
		// TODO Auto-generated method stub
		return cR.save(categories);
	}

	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>) cR.findAll();
	}

	public Category findById(Long categoryId) {
		// TODO Auto-generated method stub
		Optional<Category> optionalCategory=cR.findById(categoryId);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
			
		}
		else {
			return null;
		}
	}

	
	
}
