package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;
import com.example.CSVProject.model.PersonDatabase;
import com.example.repository.PersonRepository;

@Service


public class PersonService {
	
	
	@Autowired
	private PersonRepository personrepository;
	
	public List getAll()
	{
		
		
		List<PersonDatabase> list = this.personrepository.findAll();
		return list;

	}
	

}
