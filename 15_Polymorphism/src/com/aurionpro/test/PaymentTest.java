package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;

public class PaymentTest {
	public static void main(String[] args) {
		
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		creditCardPayment.processPayment();
		
		BankTransferPayment bankTransfer = new BankTransferPayment();
		bankTransfer.processPayment();
		
		PayPalPayment payPalPayment = new PayPalPayment();
		payPalPayment.processPayment();



	}

}
