package id.ist.livingthing.entities;

public class Ghoib extends LivingThing {
	// implements Movable {

	@Override
	public void breathing() {
		System.out.println("This Ghoib breathing...");
	}

	@Override
	public void eating() {
		System.out.println("This Ghoib eating...");
	}

	/*
	 * This is not the solution
	 
	@Override
	public void moving() {
		System.out.println("This Ghoib moving...");
	}
	 */

}
