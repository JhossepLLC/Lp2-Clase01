package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Customers;
import pe.edu.upeu.clase01.entity.Invoices;
import pe.edu.upeu.clase01.service.CustomersService;
import pe.edu.upeu.clase01.service.InvoicesService;

@RestController
public class InvoicesController {

	@Autowired
	private InvoicesService invoicesService;
	@Autowired
	private CustomersService customersService;
	
	@GetMapping("/invoices")
	public List<Invoices> getList(){
		return invoicesService.readAll();
	}
	
	@GetMapping("/customers")
	public List<Customers> getListCustomers(){
		return customersService.readAll();
	}
}
