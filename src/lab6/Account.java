package lab6;

import java.util.Date;

public class Account {
	private int id;
	private float balance;

	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		Log setBalanceLog = new Log(new Date().getTime(), id, balance,
				balance >= this.balance ? "client balance updated - deposit" : "client balance updated - withdraw");
		Logger logger = new Logger("account");
		logger.log(setBalanceLog);

		this.balance = balance;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			if(this.getId() == ((Account) obj).getId())
				return true;
		}
		return false;
	}
}
