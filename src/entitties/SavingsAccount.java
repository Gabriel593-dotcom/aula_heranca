package entitties;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount(int number, String holder, double balance) {

		super(number, holder, balance);
	}

	public SavingsAccount() {}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {

		balance += balance * interestRate;
	}

	// Saque sem a cobran�a de $5.0 a mais de Account.
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// � usado '@Override' por uma boa pr�tica de programa��o.
	// Tanto para uma maior compreens�o do c�digo
	// tanto para o programador quanto para o compilador
	// Dessa forma, o compilador entende que est� se tratando de uma
	// sobreposi��o do m�todo de uma superclasse e pode auxiliar o programador
	// quando houver um erro de digita��o por exemplo. 

}
