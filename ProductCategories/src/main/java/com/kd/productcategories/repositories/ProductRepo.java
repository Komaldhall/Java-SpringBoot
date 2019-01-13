package com.kd.productcategories.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.productcategories.models.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{
}
