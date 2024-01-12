package com.example.Repository;

import org.springframework.data.repository.CrudRepository;


import com.example.model.Emp;


public interface EmpRepository extends CrudRepository<Emp, Integer>{

}
