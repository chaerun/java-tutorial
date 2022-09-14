package id.ist.livingthing;

import id.ist.livingthing.entities.Cat;
import id.ist.livingthing.entities.Horse;
// import id.ist.livingthing.entities.Ghoib;
import id.ist.livingthing.entities.LivingThing;
import id.ist.livingthing.entities.Monkey;
import id.ist.livingthing.entities.Movable;
import id.ist.livingthing.entities.WaterAnimal;
import id.ist.livingthing.entities.Whale;

public class LivingThingMain {

	public static void main(String[] args) {
		LivingThing catThing = new Cat();
		LivingThing monkeyThing = new Monkey();
		LivingThing wheleThing = new Whale();
		// LivingThing ghoibThing = new Ghoib();
		LivingThing horseThing = new Horse();
		
		workingWithLivingThing(catThing);
		Cat cat = (Cat) catThing;
		catMeowing(cat);
		thingMoving(cat);
		
		workingWithLivingThing(monkeyThing);
		Monkey monkey = (Monkey) monkeyThing;
		monkey.climbing();
		thingMoving(monkey);
		
		workingWithLivingThing(wheleThing);
		thingMoving((Movable) wheleThing);
		
		// workingWithLivingThing(ghoibThing);
		// thingMoving((Movable) ghoibThing);
		
		/*
		 * This is not the solution
		if (ghoibThing instanceof Movable) {
			Movable movable = (Movable) ghoibThing;
			thingMoving(movable);
		}
		*/
		
		workingWithLivingThing(horseThing);
		thingMoving((Movable) horseThing);
	}
	
	private static void workingWithLivingThing(LivingThing thing) {
		System.out.println("---- " + thing.getClass().getSimpleName());
		if (thing instanceof WaterAnimal) {
			WaterAnimal waterAnimal = (WaterAnimal) thing;
			waterAnimal.swimming();
		}
		
		thing.breathing();
		thing.eating();
	}
	
	private static void catMeowing(Cat cat) {
		cat.meow();
	}
	
	private static void thingMoving(Movable movable) {
		movable.moving();
		movable.stopping();
	}

}
