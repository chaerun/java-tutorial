package id.ist.livingthing.entities;

public abstract class WaterAnimal extends Animal implements Swimable {

	@Override
	public void breathing() {
		System.out.println("This WaterAnimal breathing with insang");
	}

}
