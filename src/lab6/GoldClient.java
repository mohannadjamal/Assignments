package lab6;

public class GoldClient extends Client {
	private float commissionRate;
	private float interestRate;

	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 0.02f;
		interestRate = 0.003f;
	}
	@Override
	public String toString() {
		return "Gold, ID: " + this.getId();
	}
}
