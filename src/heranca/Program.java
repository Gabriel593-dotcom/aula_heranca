package heranca;

import entitties.Account;
import entitties.BussinessAccount;
import entitties.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Gabriel", 0.0);
		BussinessAccount bcc = new BussinessAccount(1030, "Gabriel Santos", 0.0, 500.0);

		// UPCASTING - Atribui��o de valores de uma subclasse para uma superclass

		Account acc1 = bcc;
		Account acc2 = new BussinessAccount(1031, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1032, "Ana", 0.0, 0.01);

		/*
		 * DOWNCASTING - Atribui��o de valorws de uma superclasse pra uma subclasse.
		 * Nesse caso, o cast tem que ser expl�cito, com risco de resultar na Exception
		 * 'ClassCastException'.
		 */

		bcc = (BussinessAccount) acc1;
		bcc.loan(100.0);

		/*
		 * A declara��o a seguir declara��o est� totalmente incorreta, pois o objeto
		 * acc3 � do tipo SavingsAccount, ou seja, o objeto acc5 do tipo
		 * BussinessAccount � um Account, mas n�o � SavingsAccount. Mas n�o ir� dar
		 * Exception na declara��o, mas sim na execu��o do programa. Isso por que o
		 * compilador n�o sabe que BussinessAccount n�o � uma SavingsAccount (Exce��o:
		 * ClassCastException).
		 */
		// BussinessAccount acc5 = (BussinessAccount) acc3;

		// Para tratar esse tipo de excetion, pode-se usar 'instanceof' que verifica da
		// onde que o objeto � instancia.

		if (acc3 instanceof BussinessAccount) {
			System.out.println("BussinessAccount!");
		}

		if (acc3 instanceof SavingsAccount) {

			System.out.println("SavingsAccount!");
		}

		/*
		 * O compilador ir� pular o primeiro if(), pois o objeto acc3 n�o � instancia de
		 * BussinessAccount e mostrar� a mensagem do segundo if() pois acc3 � instancia
		 * de SavingsAccount
		 */

		// OVERRIDE - Sobrescreve met�dos de uma superclasse.

		// Instanciando um objeto de Account e usando a sua opera��o 'withdraw'.
		Account acc5 = new Account(1050, "Ricardo", 1000.0);
		acc5.withdraw(200);
		System.out.println("Account: " + acc5.getBalance());

		// Instanciando um objeto de SavingsAccount e usando o met�do sobescrito.

		acc1 /* upcasting */ = new SavingsAccount(1090, "Paulo", 1200.0);
		acc1.withdraw(200);
		System.out.println("SavingsAccount: " + acc1.getBalance());

		// SUPER - Inicia atributos e met�dos de superclasses em classes filhas.
		
		acc2 = new BussinessAccount(1096, "Gustavo", 1000.0, 600.0); 
		acc2.withdraw(500.0);
		System.out.println("BussinessAccount: " + acc2.getBalance());

	}

}
