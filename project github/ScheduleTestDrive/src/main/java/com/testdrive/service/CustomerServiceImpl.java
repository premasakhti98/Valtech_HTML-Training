package com.testdrive.service;


	import org.springframework.beans.factory.annotation.Autowired;

	import com.testdrive.dao.CustomerDao;
	import com.testdrive.model.CustomerLoginModel;
	import com.testdrive.model.Customer;

	public class CustomerServiceImpl {
		@Autowired
		CustomerDao CustomerDao;

		public Customer validateUser(CustomerLoginModel CustomerLoginModel){
			return CustomerDao.validateUser(CustomerLoginModel);
			
		}
	}
