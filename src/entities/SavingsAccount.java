package entities;

public class SavingsAccount extends Account {
	

	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.bankStatement();
	}

}
