package repeatLoop;

import java.util.Scanner;

public class exercise4 {
	
	public static void main(String[] args)	{
		
		int age, gender, temper, qty, people = 0;
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Answer respectively:\n"
				+ "- GENDER (woman = 1, man = 2, non-binary = 3);\n"
				+ "- TEMPERAMENT (calm = 1, nervous = 2, aggressive = 3);\n"
				+ "- AGE."
				+ "\n\nAmount people: ");
		qty = scan.nextInt();
		
		while(people != qty) {
			
			System.out.print("\nFirst " + (people + 1) + "ª person:\n");
			gender = scan.nextInt();
			temper = scan.nextInt();
			age = scan.nextInt();
			
			if(temper == 1) {
				c1++;
			}
			
			if(gender == 1 && temper == 2) {
				c2++;
			}
				
			if(gender == 2 && temper == 3) {
				c3++;
			}
			
			if(gender == 3 && temper == 1) {
				c4++;
			}
			
			if(age > 40 && temper == 2) {
				c5++;				
			}
			
			if(age < 18 && temper == 1) {
				c6++;
			}	
			people++;
		}
		
		scan.close();
		
		System.out.println("People calm: " + c1);
		System.out.println("Nervous woman : " + c2);
		System.out.println("Agressive man: " + c3);
		System.out.println("Calm non-binary: " + c4);
		System.out.println("Nervous people over 40: " + c5);
		System.out.println("Calm people under 18: " + c6);
		
	}
}
