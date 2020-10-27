package Ex1;

import java.util.Scanner;

public class ComboMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Combo c[] = new Combo[4];
		
		for(int i = 0; i < 2; i++) {
			
			c[i] = new Combo();
			
		}
		
		for(int i = 0; i < 2 ; i++) {
			
			System.out.println("What is the main food item?:");
			c[i].setMain(input.next());
			
			System.out.println("What is the side food item?:");
			c[i].setSide(input.next());
			
			System.out.println("What is the combo price?:");
			c[i].setPrice(input.nextDouble());
			
		}
		
		c[2] = new Combo(19.99, "Hotdog", "Burger");
		c[3] = new Combo(21.99, "Fries", "Pizza");
		
		System.out.println("Main \t\tSide\t\tPrice");
		for(int i = 0; i < c.length; i++) {
			
			System.out.println(c[i].getMain() + "\t\t" + c[i].getSide() + "\t\t" + c[i].getPrice());
			
		}
		
		
	}

}
