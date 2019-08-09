package com.testdrive.service;

import com.testdrive.model.Customer;
import com.testdrive.model.CustomerRegModel;
public interface CustomerService {
	
	Customer validateUser(CustomerRegModel CustomerRegModel);
}

