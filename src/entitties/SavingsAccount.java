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

	// Saque sem a cobrança de $5.0 a mais de Account.
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// É usado '@Override' por uma boa prática de programação.
	// Tanto para uma maior compreensão do código
	// tanto para o programador quanto para o compilador
	// Dessa forma, o compilador entende que está se tratando de uma
	// sobreposição do método de uma superclasse e pode auxiliar o programador
	// quando houver um erro de digitação por exemplo. 

}
