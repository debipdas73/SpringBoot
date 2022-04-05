package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="Products")
public class Products{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private float price;
	
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//OnetoOne table mapping
	/*
	 * @OneToOne(fetch=FetchType.LAZY,optional=false)
	 * 
	 * @JoinColumn(name="id",nullable=false)
	 * 
	 * private Customer customer;
	 * 
	 * public Products() {
	 * 
	 * } public Products( String name, int quantity, float price) { this.name =
	 * name; this.quantity = quantity; this.price = price; }
	 */
	

	
}