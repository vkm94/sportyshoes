package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.model.shoe;

public interface SoeRepo extends CrudRepository<shoe, String> {

}
