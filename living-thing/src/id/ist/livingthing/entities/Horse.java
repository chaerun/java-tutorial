package id.ist.livingthing.entities;

public class Horse extends LandAnimal {

	@Override
	public void moving() {
		System.out.println("This Horse is moving");
	}

	@Override
	public void stopping() {
		System.out.println("This Horse is stopping");
	}

}
