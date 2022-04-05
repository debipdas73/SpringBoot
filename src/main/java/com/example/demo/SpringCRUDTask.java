package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.model.Products;
import com.example.demo.repo.*;
@SpringBootApplication
public class SpringCRUDTask {//implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerrepo;
	@Autowired
	private ProductRepository productrepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringCRUDTask.class, args);
	}
	
	/*
	 * public void run(String...args)throws Exception{
	 * customerrepo.deleteAllInBatch(); productrepo.deleteAllInBatch(); }
	 */
	//Customer customer=new Customer("Debiprasad");
	//Products product=new Products("Hp Laptop",10,32000);
/*	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	*/}

	
	
