package com.example.CSVProject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import readCSV.csvTobean;

import org.hamcrest.CoreMatchers;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.CSVProject.model.Person;
import com.example.CSVProject.model.PersonDatabase;
import com.example.Service.PersonService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jayway.jsonpath.internal.filter.ValueNode.JsonNode;
import com.opencsv.bean.CsvToBean;
import static net.javacrumbs.jsonunit.spring.JsonUnitResultMatchers.json;
import net.javacrumbs.jsonunit.core.Option;

@SpringBootTest

class CsvProjectApplicationTests {

	
	
	@Autowired
	csvTobean CsvToBeanReader;
	
	@Autowired
	PersonService service;
	

	@Test
	public void compareList() throws IOException {
		List<Person> all_CSV_records = CsvToBeanReader.readCSV();
	//	Object[] csv_records = all_CSV_records.toArray();
		for(Person person:all_CSV_records)
		{
			System.out.println(person);
		}
		
		List<PersonDatabase> all_database_records = service.getAll();
		for(PersonDatabase persondb: all_database_records )
        {
		System.out.println(persondb);
		}
		
		Gson gson = new Gson();
		ObjectMapper mapper = new ObjectMapper();
		//JsonParser parser = new JsonParser();
			
		try {
			String jsoncsv = gson.toJson(all_CSV_records);
			String jsondb = gson.toJson(all_database_records);
			System.out.println(jsoncsv);
			System.out.println(jsondb);
		
			//Map<String, Object> m1 = (Map<String, Object>(mapper.readValue(jsoncsv, Map.class));
	
		   //mocMvc.perform(get(jsoncsv)).andExpect(json.isEqualTo(jsondb));
		   //assertEquals(mapper.readTree(jsoncsv.toString()), mapper.readTree(jsondb.toString()));
		   JSONAssert.assertEquals(jsoncsv, jsondb, JSONCompareMode.NON_EXTENSIBLE);
		   System.out.println("Records matched");
		    }
		
		  catch(Exception e){
			System.out.println("Records does not match");
		     }
	}

} 