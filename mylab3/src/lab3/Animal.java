package lab3;


public class Animal {
	
	public String name;
	public int numberOfLegs;
	
	public Animal(String name, int Numberlegs) {
		
		this.name = name;
		this.numberOfLegs = Numberlegs;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getLegs() {
		
		return numberOfLegs;
	}

}
