package Ex3;

import java.util.Scanner;

public class SpaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Spa s[] = new Spa[6];
		
		for(int i = 0; i < 3; i++) {
			
			s[i] = new Spa();
			
		}
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("What is the name of the service?:");
			s[i].setServiceName(input.next());
			
			System.out.println("How long does the service take");
			s[i].setTime(input.nextInt());
			
			System.out.println("How long does the service take (in minutes)");
			s[i].setPrice(input.nextDouble());
			
		}
		
		s[3] = new Spa("Nails", 30, 75);
		s[4] = new Spa("Waxing", 60, 125);
		s[5] = new Spa("Cut", 25, 120);
		
		System.out.println("-=+ Report 1 +=-");
		System.out.println("Service\t\t\tTime (min)\t\t\tPrice");
		for(int i = 0; i < s.length; i++) {
			
			System.out.println(s[i].getServiceName() + "\t\t\t" + s[i].getTime() + "\t\t\t\t" + s[i].getPrice());
			
		}
		
		System.out.println();
		System.out.println("-=+ Report 2 +=-");
		System.out.println("Service\t\t\tTime (min)\t\t\tPrice");
		for(int i = 0; i < s.length; i++) {
			
			if(s[i].getPrice() > 50) {
				
				System.out.println(s[i].getServiceName() + "\t\t\t" + s[i].getTime() + "\t\t\t\t" + s[i].getPrice());
				
			}
			
			
		}
		
		System.out.println();
		System.out.println("-=+ Report 3 +=-");
		System.out.println("Service\t\t\tTime (min)\t\t\tPrice");
		for(int i = 0; i < s.length; i++) {
			
			if(s[i].getTime() > 30) {
				
				System.out.println(s[i].getServiceName() + "\t\t\t" + s[i].getTime() + "\t\t\t\t" + s[i].getPrice());
				
			}
			
			
		}

	}

}
