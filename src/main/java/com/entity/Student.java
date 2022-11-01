package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studentId;
	String name;
	String address;
	String mobile;
	
	@ManyToMany(mappedBy = "student",cascade = CascadeType.ALL)
	List<Book>books=new ArrayList<>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String address, String mobile) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	
	public Student(String name, String address, String mobile) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
