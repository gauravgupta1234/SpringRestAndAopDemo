package com.yash.AOPPROJECT;

public class AccountService {

	public void getBalance() {

		System.out.println("AccountService getBalance ----------Begin");
		System.out.println("AccountService getBalance ----------DONE");
		System.out.println("AccountService getBalance ----------END ");
	}

	public void myDeposite() {

		System.out.println("AccountService myDeposite ----------BEGIN");
		System.out.println("AccountService myDeposite ----------DONE");
		System.out.println("AccountService myDeposite ----------END");
	}

	public void myWithdraw() throws RuntimeException {
		System.out.println("AccountService myWithdraw---------- BEGIN ");
		if(1==1){
		throw new UnsufficentbalEcception();
		}
		System.out.println("AccountService myWithdraw ---------- END ");
	}

}
