package com.testdrive.dao;

	import com.testdrive.model.Customer;
	import com.testdrive.model.CustomerLoginModel;

	public interface CustomerDao {

		Customer validateUser(CustomerLoginModel CustomerLoginModel);

	}

