package readCSV;
import com.example.CSVProject.model.*;
import com.example.CSVProject.model.Person;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

import org.springframework.context.annotation.Bean;
import com.opencsv.bean.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import com.opencsv.CSVReader;



@Component
public class csvTobean {
	
	   public List<Person> readCSV() throws FileNotFoundException {
		String fileName = "C:\\Users\\Pratistthashukla\\eclipse-workspace\\CSVProject\\CSVProject\\src\\main\\resources\\persons.csv";
		List<Person> beans = new CsvToBeanBuilder<Person>(new FileReader(fileName)).withType(Person.class).build().parse();
		for(Person person:beans)
		{
			
			System.out.println(person);
		}
		return beans;
	  
	}

}
