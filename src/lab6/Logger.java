package lab6;

public class Logger {
	private String driverName;

	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	public static void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		return null;//To do
	}
	
}
