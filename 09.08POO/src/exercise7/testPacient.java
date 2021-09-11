package exercise7;

public class testPacient {
	
	public static void main(String[] args) {
		
		pacient pacient1 = new pacient();
		
		pacient1.setDiagnostic("Rhinitis");
		
		System.out.println("Diagnostic: " + pacient1.name);
		System.out.println("Diagnostic: " + pacient1.getDiagnostic());
	}
}
