package id.ist.livingthing.entities;

public interface Movable {
	
	void moving();
	// void stopping();
	
	default void stopping() {
		System.out.println("New stopping method...");
	}

}
