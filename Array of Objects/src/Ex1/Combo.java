package Ex1;

public class Combo {
	
	double price;
	String side, main;
	
	public Combo(double p, String s, String m) {
		
		price = p;
		side = s;
		main = m;
		
	}
	
	public Combo() {
		
	}
	
	
	public void setMain(String m) {
		
		main = m;
		
	}
	
	public void setSide(String s) {
		
		side = s;
		
	}
	
	public void setPrice(double p) {
		
		price = p;
		
	}
	
	public String getMain() {
		
		return main;
		
	}
	
	public String getSide() {
		
		return side;
		
	}
	
	public double getPrice() {
		
		return price;
		
	}

}
