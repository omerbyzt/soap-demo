package com.ba.service;

import java.util.ArrayList;
import java.util.List;

import com.ba.converter.CustomerConverter;
import com.ba.dao.CustomerDao;
import com.ba.dto.CustomerDTO;
import com.ba.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerDao = new CustomerDao();

	@Override
	public boolean addCustomer(CustomerDTO customerDTO) {
		
		try {
			customerDao.addCustomer(CustomerConverter.toEntity(customerDTO));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
		return true;
	}

	@Override
	public boolean updateCustomer(CustomerDTO customerDTO) {
		customerDao.updateCustomer(CustomerConverter.toEntity(customerDTO));
		return true;
	}  

	@Override
	public List<CustomerDTO> getAllCustomer(){
		List<Customer>customerList = customerDao.getAllCustomer();
		List<CustomerDTO> customerDTOList = new ArrayList<CustomerDTO>();
		for(Customer customer : customerList) {
			CustomerDTO customerDTO = CustomerConverter.toDTO(customer);
			customerDTOList.add(customerDTO);
		}
		return customerDTOList;
	}
}
