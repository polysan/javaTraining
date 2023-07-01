package chapter3;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(int ammount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		this.balance += ammount;
	}

	public void withDrawals(int ammount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		this.balance -= ammount;
	}

	public int getBalance() {
		return this.balance;
	}

}
