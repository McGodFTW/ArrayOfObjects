package Ex2;

public class Prom {
	
	int ticketNum;
	String name, guest;
	
	public Prom(int t, String n, String g) {
		
		ticketNum = t;
		name = n;
		guest = g;
		
	}
	
	public Prom() {
		
	}
	
	
	public void setGuest(String g) {
		
		guest = g;
		
	}
	
	public void setName(String n) {
		
		name = n;
		
	}
	
	public void setTicketNum(int t) {
		
		ticketNum = t;
		
	}
	
	public String getGuest() {
		
		return guest;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getTicketNum() {
		
		return ticketNum;
		
	}

}
