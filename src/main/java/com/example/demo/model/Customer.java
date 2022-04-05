package com.example.demo.model;


//import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Entity;
@Entity
//@Table(name="Customer")
public class Customer  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Customer() {
		super();
	}
	
	
	
	//Mapping two table
	/*
	 * @OtneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL, mappedBy="Cusomer")
	 * 
	 * private Products product;
	 * 
	 * public Customer() {
	 * 
	 * }
	 * 
	 * public Customer(String name) {
	 * 
	 * this.name=name; }
	 */
	
}
