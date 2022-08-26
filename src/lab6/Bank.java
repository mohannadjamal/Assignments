package lab6;

import java.util.Date;

public class Bank {
	private Client[] clients;
	private Logger logService;
	// private ? accountUpdater;
	private static Bank single_instance = null;
	private static float totalCommission;

	public Bank() {
		clients = new Client[100];
	}

	public static Bank getInstance() {
		if (single_instance == null) {
			single_instance = new Bank();
		}
		return single_instance;
	}

	public static void updateTotalCommission(float commission) {
		totalCommission = commission;
	}

	public float getBalance() {
		int totalBalance = 0;
		for (Client client : clients) {
			totalBalance += client.getFortune();
		}
		return totalBalance;
	}
	
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;

				Log addClientLog = new Log(new Date().getTime(), client.getId(), 0, "client added");
				logService = new Logger(client.getName());
				logService.log(addClientLog);
				break;
			}
		}
	}

	public void removeClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i].equals(client)) {
				clients[i] = null;

				Log removeClientLog = new Log(new Date().getTime(), clients[i].getId(), 0, "client removed");
				logService = new Logger(clients[i].getName());
				logService.log(removeClientLog);
				break;
			}
		}
	}

	public void printClientList() {
		for (Client client : clients) {
			System.out.println(client.toString());
		}
	}

	public Client[] getClients() {
		return clients;
	}

	public void viewLogs() {

	}

	public void startAccountUpdater() {

	}
}
