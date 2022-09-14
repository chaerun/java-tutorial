package id.ist.livingthing.entities;

public class Monkey extends LandAnimal {

	@Override
	public void moving() {
		System.out.println("This Monkey is moving");
	}
	
	public void climbing() {
		System.out.println("Climbing...");
	}

}
