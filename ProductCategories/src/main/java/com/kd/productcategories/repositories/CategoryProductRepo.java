package com.kd.productcategories.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.productcategories.models.CategoryProduct;
@Repository

public interface CategoryProductRepo extends CrudRepository<CategoryProduct, Long>  {

}
