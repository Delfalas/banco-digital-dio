package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.Bank;
import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		
		Bank bank = new Bank("DIO BANK", 8899);
		
		//criação das contas
		Client c1 = new Client();
		c1.setName("Vinicius");
		
		Client c2 = new Client();
		c2.setName("João");
		
		Client c3 = new Client();
		c3.setName("Mario");
		
		Account cc1 = new CheckingAccount(c1);
		Account p1 = new SavingsAccount(c2);
		Account cc2 = new CheckingAccount(c3);

		//operações bancárias
		cc1.deposit(500);
		p1.deposit(1000.00);
		cc1.transfer(100, cc2);
		
		//impressão dos dados do Banco
		System.out.println("Banco '" + bank.getName() + "' de número '" + bank.getNumber() + "'");
		System.out.println();
		
		cc1.imprimirExtrato();
		p1.imprimirExtrato();
		cc2.imprimirExtrato();
		
		// Criando uma lista de contas e adicionando as contas
        List<Account> accountList = new ArrayList<>();
        accountList.add(cc1);
        accountList.add(p1);
        accountList.add(cc2);
        
        // Criando o banco com a lista de contas
        bank = new Bank(accountList);
        
        System.out.println();
        // Imprimindo o número de contas
        System.out.println("Número de contas no banco: " + accountList.size());
        
        // (Opcional) Listar todas as contas
        System.out.println("Contas:");
        for (Account acc : accountList) {
            System.out.println(acc);
        }

	}

}
