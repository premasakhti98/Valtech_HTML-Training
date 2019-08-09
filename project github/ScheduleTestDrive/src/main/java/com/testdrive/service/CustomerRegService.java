package com.testdrive.service;

import com.testdrive.model.Customer;
import com.testdrive.model.CustomerLoginModel;
public interface CustomerRegService {
	
	Customer validateUser(CustomerLoginModel CustomerLoginModel);
}


