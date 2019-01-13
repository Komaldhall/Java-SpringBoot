package com.kd.cemployeemanagers.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.cemployeemanagers.models.Employees;
@Repository
public interface EmployeeRepo extends CrudRepository<Employees, Long> {

	

}
