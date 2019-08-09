package com.testdrive.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.testdrive.dao.DealerDao;
import com.testdrive.model.DealerLoginModel;
import com.testdrive.model.Dealer;

public class DealerServiceImpl {

	@Autowired
	DealerDao DealerDao;

	public Dealer validateUser(DealerLoginModel DealerLoginModel){
		return DealerDao.validateUser(DealerLoginModel);
		
	}
}
