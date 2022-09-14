package id.ist.livingthing.entities;

public class Whale extends WaterAnimal {

	@Override
	public void moving() {
		System.out.println("This Whale is moving");
	}

	@Override
	public void swimming() {
		System.out.println("This Whale is swimming");
	}

}
