package com.mycompany.firstappp.service.impl;

import com.mycompany.firstappp.service.interfaces.AddService;

public class AddServiceImpl implements AddService {

	@Override
	public int addService(int val1, int val2) {
		// TODO Auto-generated method stub
		int result = val1 + val2;
		
		return result;
	}

}
