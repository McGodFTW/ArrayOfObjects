package Ex2;

import java.util.Scanner;

public class PromTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Prom p[] = new Prom[6];
		
		for(int i = 0; i < 3; i++) {
			
			p[i] = new Prom();
			
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("What is your name?:");
			p[i].setName(input.next());
			
			System.out.println("Are you a guest? (Y/N)");
			p[i].setGuest(input.next());
			
			p[i].setTicketNum(i + 1);
			System.out.println();
			
		}
		
		p[3] = new Prom(4, "Yasmin", "Y");
		p[4] = new Prom(5, "David", "N");
		p[5] = new Prom(6, "Mike", "Y");
		
		System.out.println("    Everyone attending");
		System.out.println("Name\t\t Ticket Number");
		for(int i = 0; i < p.length; i++) {
			
			
			System.out.println(p[i].getName() + "\t\t\t" + p[i].getTicketNum());
			
		}
		
		System.out.println();
		System.out.println("    Guests attending");
		System.out.println("Name\t\t Ticket Number");
		for(int i = 0; i < p.length; i++) {
			
			if(p[i].getGuest().equalsIgnoreCase("y")) {
				
				System.out.println(p[i].getName() + "\t\t\t" + p[i].getTicketNum());
				
			}
			
			
		}
	}

}
