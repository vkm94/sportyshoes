package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.model.order;

public interface OrderRepo extends CrudRepository<order,String>{

}
