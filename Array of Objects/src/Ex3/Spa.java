package Ex3;

public class Spa {
	
	String serviceName;
	int time;
	double price;
	
	public Spa() {
		
	}
	
	public Spa(String s, int t, double p) {
		
		serviceName = s;
		time = t;
		price = p;
		
	}
	
	public void setServiceName(String s) {
		
		serviceName = s;
		
	}
	
	public void setTime(int t) {
		
		time = t;
		
	}
	
	public void setPrice(double p) {
		
		price = p;
		
	}
	
	public String getServiceName() {
		
		return serviceName;
		
	}
	
	public int getTime() {
		
		return time;
		
	}
	
	public double getPrice() {
		
		return price;
		
	}

}
