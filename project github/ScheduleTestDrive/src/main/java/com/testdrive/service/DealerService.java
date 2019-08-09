package com.testdrive.service;

import com.testdrive.model.Dealer;
import com.testdrive.model.DealerLoginModel;

public interface DealerService {
	Dealer validateUser(DealerLoginModel DealerLoginModel);
}

