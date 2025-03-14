package com.si.placementmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String qualification;
	private int year;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Placement() {
		super();
	}
	public Placement(Long id, String name, String qualification, int year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", qualification=" + qualification + ", year=" + year + "]";
	}

	
	
}
