package com.testdrive.dao;
	import com.testdrive.model.Dealer;
	import com.testdrive.model.DealerLoginModel;

	public interface DealerDao {

		Dealer validateUser(DealerLoginModel DealerLoginModel);

	}



