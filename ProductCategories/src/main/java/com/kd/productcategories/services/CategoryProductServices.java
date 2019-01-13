package com.kd.productcategories.services;


import org.springframework.stereotype.Service;

import com.kd.productcategories.models.CategoryProduct;
import com.kd.productcategories.repositories.CategoryProductRepo;
@Service
public class CategoryProductServices {
	private final CategoryProductRepo cP;

	public CategoryProductServices(CategoryProductRepo cP) {
		this.cP = cP;
	}
	public CategoryProduct createCategoryProduct(CategoryProduct cp) {
		// TODO Auto-generated method stub
		return cP.save(cp);
	}
	
	
}
