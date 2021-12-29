package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface MyRepo extends JpaRepository<User, String> {

	Optional<User> findById(String name);

	void deleteById(String name);


	

}
