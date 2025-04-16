package entities;

public class CheckingAccount extends Account {
	

	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.bankStatement();
	}

}
