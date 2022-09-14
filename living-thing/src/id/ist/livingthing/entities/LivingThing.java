package id.ist.livingthing.entities;

public abstract class LivingThing {
	
	protected String name;
	
	public abstract void breathing();
	public abstract void eating();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
