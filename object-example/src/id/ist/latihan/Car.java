package id.ist.latihan;

import java.awt.Color;

public class Car {
	
	private String name;
	private Color color;
	
	public Car() {
	}
	
	public Car(String name, Color color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

}
