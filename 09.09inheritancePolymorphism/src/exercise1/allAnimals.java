package exercise1;

public class allAnimals {
	
	public static void main(String[] args) {
	
		classDog dog = new classDog();
		classHorse horse = new classHorse();
		classSloth sloth = new classSloth();
		
		dog.setName("Jhow");
		dog.setAge(1);
		dog.setSound("Woof");
		dog.setMovement("Run too fast!");
		
		horse.setName("My little Horse");
		horse.setAge(27);
		horse.setSound("Neigh");
		horse.setMovement("Run very very fast!");
		
		sloth.setName("Preguicinha");
		sloth.setAge(16);
		sloth.setSound("Aaaah");
		sloth.setMovement("Slooow mooov..");
		
		System.out.println("=============== DOG ===============");
		System.out.println(dog.getName() 
							+ "\n" + dog.getAge() 
							+ "\n" + dog.getSound() 
							+ "\n" + dog.getMovement());
			
		System.out.println("\n=============== HORSE ===============");
		System.out.println(horse.getName() 
							+ "\n" + horse.getAge() 
							+ "\n" + horse.getSound() 
							+ "\n" + horse.getMovement());
		
		System.out.println("\n=============== HORSE ===============");
		System.out.println(sloth.getName() 
							+ "\n" + sloth.getAge() 
							+ "\n" + sloth.getSound() 
							+ "\n" + sloth.getMovement());	
	}
}
