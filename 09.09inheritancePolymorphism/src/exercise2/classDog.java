package exercise2;

public class classDog extends animal {
	
	@Override
	public void name() {
		System.out.println("Name: Jhow");	
	}

	@Override
	public void age() {
		System.out.println("Age: " + 1);
	}

	@Override
	public void sound() {
		System.out.println("Sound: Woof");	
	}

	@Override
	public void movement() {
		System.out.println("Movement: Run too fast!");		
	}
}
