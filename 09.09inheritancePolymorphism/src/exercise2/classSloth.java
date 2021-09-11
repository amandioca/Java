package exercise2;

public class classSloth extends animal {

	@Override
	public void name() {
		System.out.println("Name: Preguicinha");
	}
	
	@Override
	public void age() {
		System.out.println("Age: " + 16);
	}
	
	@Override
	public void sound() {
		System.out.println("Sound: Aaaaah");
	}
	
	@Override
	public void movement() {
		System.out.println("Movement: Slooow mooov..");
	}
}
