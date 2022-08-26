package lab6;

public class PlatinumClient extends Client {
	private float commissionRate;
	private float interestRate;

	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 0.01f;
		interestRate = 0.005f;
	}

	@Override
	public String toString() {
		return "Platinum, ID: " + this.getId();
	}
}
