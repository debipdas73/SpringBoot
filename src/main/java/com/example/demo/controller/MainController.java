package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.model.Products;

import com.example.demo.service.ProductService;
import com.example.demo.service.CustomerService;

/*
 * @author:Debiprasad Das
 * */
@Controller
public class MainController {
	@Autowired
	private ProductService service;
	@Autowired
    private CustomerService service1;
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Products> listProducts = service.listAll();
		List<Customer> listCustomers=service1.listAll();
	  model.addAttribute("listCustomers",listCustomers);
		model.addAttribute("listProducts",listProducts);
		System.console();
		return "index";
	}
	public String viewCustomer(Model model) {
		return "";
	}

	@RequestMapping("/new")
	public String showNew(Model model) {
		Products product = new Products();
		model.addAttribute("product", product);
		return "new_product";
	}
	@RequestMapping("/new1")
	public String showNewCustomer(Model model) {
		Customer customer=new Customer();
		model.addAttribute(customer);
		return "new_customer";
	}
	
	

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Products product) {
		service.save(product);
		return "redirect:/";
	}
	@RequestMapping(value = "/save1", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service1.save1(customer);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEdit(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Products product = service.get(id);
		mav.addObject("product", product);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}
}