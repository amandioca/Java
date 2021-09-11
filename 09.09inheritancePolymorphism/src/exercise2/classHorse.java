package exercise2;

public class classHorse extends animal {
	
	@Override
	public void name() {
		System.out.println("Name: My little Horse");
	}
	
	@Override
	public void age() {
		System.out.println("Age: " + 27);
	}
	
	@Override
	public void sound() {
		System.out.println("Sound: Neigh");
	}

	@Override
	public void movement() {
		System.out.println("Movement: Run very very fast!");
	}
}
