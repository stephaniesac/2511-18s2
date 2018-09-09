// package examples.tut06;

import java.time.LocalDate;

/**
 * Simple program to test design by contract.
 * @invariant balance >= 0
 */
public class BankAccount {
	private int balance;
	private static final int WITHDRAW_LIMIT = 800;
	private int todayWithdrawal;
	private LocalDate lastWithdrawal;

	/**
	 * Initialize bank account with zero balance.
	 * @param balance the opening balance
	 */
	public BankAccount(int balance) {
		this.balance = balance;
		this.todayWithdrawal = 0;
	}

	/**
	 * Add amount to balance.
	 * @precondition amount >= 0
	 */
	public void deposit(int amount)	{
		balance += amount;
	}

	/**
	 * Deduct amount from balance only if sufficient funds and not over daily limit.
	 * @precondition amount >= 0
	 */
	// TODO why boolean?
	public boolean withdraw(int amount) {
		LocalDate today = LocalDate.now();

		// If last withdrawal was not on this day, reset the withdrawn amount
		if (lastWithdrawal == null || !sameDay(lastWithdrawal, today))
			todayWithdrawal = 0;

		// Check if amount is a valid withdraw.
		if (amount > balance || todayWithdrawal + amount > WITHDRAW_LIMIT)
			return false;

		// Finally, allow withdrawal and update balances.
		balance -= amount;
		todayWithdrawal += amount;
		lastWithdrawal = today;
		return true;
	}

	/**
	 * Used for testing only!
	 * Necessary if amount <= balance is a precondition of withdraw, but not needed here.
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Reset last withdrawal day and reset withdrawn amount only if day changes.
	 * Used for testing only!
	 */
	public void setDay(LocalDate c)	{
		if (!c.equals(lastWithdrawal)) {
			lastWithdrawal = c;
			todayWithdrawal = 0;
		}
	}

	/**
	 * Standard equals method for Calendar days.
	 */
	private boolean sameDay(LocalDate lastWithdrawal2, LocalDate today) {
		return lastWithdrawal2.equals(today);
	}
}
