package exercise4;

public class testEmployee {

	public static void main(String[] args) {
		
		employee emp1 = new employee();
		
		emp1.setRegistry(68629);
		
		
		System.out.println("Name: " + emp1.name);
		System.out.println("Registry: " + emp1.getRegistry());
	}
}
