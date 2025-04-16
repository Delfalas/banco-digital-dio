package entities;

public abstract class Account {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	public Account(Client client) {
		this.agency = Account.AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.client = client;
	}


	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double value) {
		balance -= value;
	}

	
	public void deposit(double value) {
		balance += value;
	}

	
	public void transfer(double value, Account targetAccount) {
		this.withdraw(value);
		targetAccount.deposit(value);
	}


	protected void bankStatement() {
		System.out.println(String.format("Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Account Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
	
	abstract public void imprimirExtrato();

	@Override
	public String toString() {
		return "Account [agency = " + agency + ", number = " + number + (String.format(", balance = %.2f ", balance)) + ", " + client + "]";
	}
	

}
