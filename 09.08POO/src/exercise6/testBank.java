package exercise6;

public class testBank {

	public static void main(String[] args) {
		
		bank client1 = new bank();
		
		client1.balance = 23433;
		client1.name = "Priscila Davanse";
		client1.setCPF("123.456.789-10");
		
		System.out.println("Client: " + client1.name);
		System.out.println("Balance: " + client1.balance);
		System.out.println("CPF: " + client1.getCPF());
	}
}