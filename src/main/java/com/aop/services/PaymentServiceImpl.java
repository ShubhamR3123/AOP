package com.aop.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {

		System.out.println(amount+":Amount Debited....");

		
		System.out.println(amount+":Amount credited....");

	}

}
