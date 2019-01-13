package com.kd.productcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.productcategories.models.Product;
import com.kd.productcategories.repositories.ProductRepo;
@Service
public class ProductServices {
	private final ProductRepo pR;

	public ProductServices(ProductRepo pR) {
		this.pR = pR;
	}

	public Product createProduct(Product products) {
		// TODO Auto-generated method stub
		return pR.save(products);
	}

	public Product findById(Long productId) {
		// TODO Auto-generated method stub
		Optional<Product> optionalProduct=pR.findById(productId);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
			
		}
		else {
			return null;
		}
	}
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return (List<Product>) pR.findAll();
	}
}
