package com.example.CSVProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.opencsv.bean.CsvBindByName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

@Entity
@Table(name = "info")
public class PersonDatabase {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   
   @Column(name = "id")
	Integer ID;
   @Column(name = "name")
	String name;
   @Column(name = "Mobile")
	Integer Mobile;
   
   PersonDatabase()
   {
	   
   }
   public PersonDatabase(String name, Integer Mobile)
   {
	   this.name = name;
	   this.Mobile = Mobile;
   }
	
	
	@Override
	public String toString() {
		return "ID=" + ID + ", name=" +name+ ", Mobile=" +Mobile+"";
	}
}
