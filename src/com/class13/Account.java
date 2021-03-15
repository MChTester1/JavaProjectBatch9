package com.class13;

public class Account {
   
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	public void login(String passedUSerNameWhenLogging,String passedPasswordWhenLogging) {
		if(userName.equals(passedUSerNameWhenLogging)&& password.equals(passedPasswordWhenLogging)){
		System.out.println("Welcome to bank of America your balance is "+balance);
	}else {
		System.out.println("Username or password is not correct");
	}
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your account number is "+accountNumber+ "Your balance is "+balance);
		}
	}
public void printUsernameAndPassword(String userName, String password) {
	System.out.println(userName);
	if(userName.equals("Bryan")) {
		System.out.println("Hi Bryan");
	}
}
}

