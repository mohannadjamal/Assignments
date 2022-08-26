package lab6;

import java.util.Date;

public abstract class Client {
	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	protected final float commissionRate = 0;
	protected final float interestRate = 0;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		accounts = new Account[5];
		logger = new Logger(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		boolean isExisting = false;
		for (Account acc : accounts) {
			if (acc.getId() == account.getId())
				isExisting = true;
		}
		if (!isExisting) {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] == null) {
					accounts[i] = account;
					Log addAccountLog = new Log(new Date().getTime(), this.id, 0, "account update - opened");
					logger.log(addAccountLog);
					break;
				}
			}
		}
	}

	public Account getAccount(int id) {
		for (Account acc : accounts) {
			if (acc.getId() == id)
				return acc;
		}
		return null;
	}

	public void removeAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].equals(account)) {
				accounts[i] = null;
				Log removeAccountLog = new Log(new Date().getTime(), this.id, 0, "client removed");
				logger.log(removeAccountLog);
				break;
			}
		}
	}

	public void deposit(float amount) {
		setBalance(this.balance + (amount - (amount * commissionRate)));
	}

	public void withdraw(float amount) {
		setBalance(this.balance - (amount + (amount * commissionRate)));
		Bank.updateTotalCommission(amount);
	}

	public void autoUpdateAccounts() {
		for (Account acc : accounts) {
			float amount = acc.getBalance() + (acc.getBalance() * interestRate);
			acc.setBalance(amount);

			Log updateAccountLog = new Log(new Date().getTime(), id, amount, "bank auto account interest update");
			logger.log(updateAccountLog);
		}
	}

	public float getFortune() {
		float fortune = balance;
		for (Account acc : accounts) {
			fortune += acc.getBalance();
		}
		return fortune;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Client) {
			if (this.getId() == ((Client) obj).getId()) {
				return true;
			}
		}
		return false;
	}
}
