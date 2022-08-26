package lab6;

public class Log {
	private long timestamp;
	private int clientId;
	private float amount;
	/*
	 * private String[] description = { "client added", "client removed",
	 * "client balance updated - deposit", "client balance updated - withdraw",
	 * "account update - closed", "account update - opened",
	 * "bank auto account interest update" };
	 */
	private String description;

	public Log(long timestamp, int clientId, float amount, String description) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.amount = amount;
		this.description = description;
	}

	public String getData() {
		return timestamp + ", client-" + clientId + ", " + description + ", " + amount;
	}
}
