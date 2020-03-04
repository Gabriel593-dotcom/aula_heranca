package entitties;

public class BussinessAccount extends Account {

	private Double loanLimit;

	public BussinessAccount() {
		super();
	}

	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {

		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {

		if (amount <= loanLimit) {

			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) {

		// SUPER().

		super.withdraw(amount);
		balance -= 2;

		// Inicia métodos e atributos de classes pais
		// Nesse caso é o método 'withdraw()' que está sendo reutilizado
		// com um acréscimo de $2.0 em taxa para BussinessAccount
	}

}
