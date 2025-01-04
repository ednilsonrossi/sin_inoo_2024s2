package br.edu.ifsp.inoo;

public class Client {
	private static int LAST_TICKET = 0;
	
	private int ticketNumber;
	private boolean isPriority;
	
	public Client() {
		this(false);
	}

	public Client(boolean isPriority) {
		updateLastTicket();
		ticketNumber = LAST_TICKET;
		this.isPriority = isPriority;
	}
	
	@Override
	public String toString() {
		String str;
		if (isPriority) {
			str = "P-";
		} else {
			str = "C-";
		}
		if (ticketNumber < 10) {
			str += "00" + getTicketNumber();
		} else if (ticketNumber < 100) {
			str += "0" + getTicketNumber();
		} else {
			str += getTicketNumber();
		}
		return str;
	}
	
	public int getTicketNumber() {
		return ticketNumber;
	}

	public boolean isPriority() {
		return isPriority;
	}

	private void updateLastTicket() {
		LAST_TICKET += 1;
	}
}
