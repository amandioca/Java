package repeatLoop;

import java.util.Scanner;

public class exercise3 {
	
	public static void main(String[] args)	{
		
		int babyShark = 0, youngShark = 0, grandmaShark = 0, age = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the ages (-99 to finish): ");
		while(age != -99) {
			
			age = read.nextInt();
			
			if(age > 0 && age < 21) {
				babyShark++;
			}
			
			else if(age > 50) {
				grandmaShark++;
			}
			
			else if(age >= 21 && age <= 50) {
				youngShark++;
			}
		}
		
		read.close();
		
		System.out.print("\nBaby shark total: " + babyShark + "\nYoung shark total: " + youngShark 
				+ "\nGrandma shark total: " + grandmaShark);
	}

}
