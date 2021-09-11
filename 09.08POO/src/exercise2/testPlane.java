package exercise2;

public class testPlane {

	public static void main(String[] args) {
		
		plane plane = new plane();
		
		plane.setModel("Airbus 350");
		
		System.out.println("Seat: " + plane.seat);
		System.out.println("Model: " + plane.getModel());
	}
}
