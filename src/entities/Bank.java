package entities;

import java.util.List;

public class Bank {
	
	private String name;
	private int number;
	
	
	
	public Bank(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}


	public Bank(List<Account> accountList) {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getNumber() {
		return number;
	}
	

	public void setNumber(int number) {
		this.number = number;
	}



}
