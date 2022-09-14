package id.ist.livingthing.entities;

public abstract class Animal extends LivingThing implements Movable {

	@Override
	public void eating() {
		System.out.println("This Animal eating using it's mouth");
	}

}
