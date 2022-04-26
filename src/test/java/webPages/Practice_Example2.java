package webPages;

class Vehical{
	void run() {
		System.out.println("vehical is runing");
	}
}
   class Bike extends Vehical{
	void run() {
		System.out.println("Bike is runing");
	}
}

public class Practice_Example2 {
	
	 public static void main(String[] args) {
		 Vehical v1 = new Vehical();
		 v1.run();
		 
		 Bike b1 = new Bike();
		 b1.run();
		
		 
		
     
	}
}