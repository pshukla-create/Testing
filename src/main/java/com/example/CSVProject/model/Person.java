package com.example.CSVProject.model;
import javax.persistence.Column;

import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvBindByName;


@Component

public class Person {
	
	@CsvBindByName(column="id")
	private int ID;
	@CsvBindByName(column="name")
	private String name;
	@CsvBindByName(column="Mobile")
	private long Mobile;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return Mobile;
	}
	public void setMobile(Long Mobile) {
		this.Mobile = Mobile;
	}
	
	@Override
	public String toString() {
		return "ID=" + ID + ", name=" +name+ ", Mobile=" +Mobile+"";
	}
	
	
	

	
	
	

}
