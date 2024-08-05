package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment();
		payment.processPayment();
		
//		CreditCardPayment creditCardPayment = new CreditCardPayment();
//		creditCardPayment.processPayment();
//		
//		BankTransferPayment bankTransfer = new BankTransferPayment();
//		bankTransfer.processPayment();

	}

}
