package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CSVProject.model.PersonDatabase;
import com.sun.el.stream.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonDatabase, Integer> {
	
	
	 
}
