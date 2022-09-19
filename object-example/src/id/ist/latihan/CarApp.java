package id.ist.latihan;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarApp {

	public static void main(String[] args) {
		var list = mockCarList();
		// Find car with color BLUE
		
		var set = mockCarSet();
		// Find car with color BLUE
	}
	
	private static List<Car> mockCarList() {
		var list = new ArrayList<Car>();
		list.add(new Car("A", Color.RED));
		list.add(new Car("B", Color.GREEN));
		list.add(new Car("C", Color.BLUE));
		list.add(new Car("D", Color.WHITE));
		list.add(new Car("E", Color.BLACK));
		
		return list;
	}
	
	private static Set<Car> mockCarSet() {
		var set = new HashSet<Car>();
		set.add(new Car("A", Color.RED));
		set.add(new Car("B", Color.GREEN));
		set.add(new Car("C", Color.BLUE));
		set.add(new Car("D", Color.WHITE));
		set.add(new Car("E", Color.BLACK));
		
		return set;
	}

}
