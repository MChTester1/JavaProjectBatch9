package com.class13;

public class BankApplications {

	public static void main(String[] args) {
		
		Account ghulamsAccount=new Account();
		ghulamsAccount.accountNumber="123";
		ghulamsAccount.userName="Ghulam123";
		ghulamsAccount.password="pass123";
		ghulamsAccount.balance=1400;
		ghulamsAccount.login("asdhuag","gjgf");
		ghulamsAccount.printUsernameAndPassword("Ahmed", "Ahmed123");
	}

}
