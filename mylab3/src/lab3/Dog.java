package lab3;

public class Dog extends Animal {
	
	public String name;
	public int legs;

	public Dog(String name, int Numberlegs) {
		super(name, Numberlegs);
		this.name = name;
		this.legs = Numberlegs;
	}
	

	@Override
	public String toString() {
		return "Name: "+super.getName()+" Legs: "+super.getLegs();
	}
}
