package lab6;

public class RegularClient extends Client {
	private float commissionRate;
	private float interestRate;

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 0.02f;
		interestRate = 0.001f;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Regular, ID: " + this.getId();
	}
}
