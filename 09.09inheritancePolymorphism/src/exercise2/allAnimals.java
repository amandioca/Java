package exercise2;

import java.util.Scanner;

public class allAnimals {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		classDog dog = new classDog();
		classHorse horse = new classHorse();
		classSloth sloth = new classSloth();
		
		System.out.println("=============== DOG ==============="); 
		dog.name();
		dog.age();
		dog.sound();
		dog.movement();
		
		System.out.println("\n=============== HORSE ==============="); 
		horse.name();
		horse.age();
		horse.sound();
		horse.movement();
		
		System.out.println("\n=============== SLOTH ===============");
		sloth.name();
		sloth.age();
		sloth.sound();
		sloth.movement();
	}
}
