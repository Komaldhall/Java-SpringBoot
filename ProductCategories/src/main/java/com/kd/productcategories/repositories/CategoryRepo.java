package com.kd.productcategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.productcategories.models.Category;


@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
	
}
