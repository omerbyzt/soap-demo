package com.ba.service;

import java.util.List;

import com.ba.dto.CustomerDTO;

public interface CustomerService {

	public boolean addCustomer(CustomerDTO customerDTO);
	
	public boolean deleteCustomer(int id);
	
	public boolean updateCustomer(CustomerDTO customerDTO);
	
	public List<CustomerDTO> getAllCustomer();
}
