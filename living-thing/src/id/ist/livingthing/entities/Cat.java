package id.ist.livingthing.entities;

public class Cat extends LandAnimal {

	@Override
	public void moving() {
		System.out.println("This Cat is moving");
	}

	@Override
	public void eating() {
		System.out.println("This Cat is eating... meow... meow");
	}
	
	public void meow() {
		System.out.println("Meow... meow");
	}

	@Override
	public void stopping() {
		System.out.println("This Cat is stopping");
	}
	
}
