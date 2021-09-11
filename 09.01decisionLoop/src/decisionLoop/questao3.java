package decisionLoop;

import java.util.Scanner;

public class questao3 {
	
	public static void main(String[] args)	{
		
		int age;
		
		Scanner read = new Scanner(System.in);
				
		System.out.println("Enter your age: ");
		age = read.nextInt();

			if(age >= 10 && age <= 14)	{
				System.out.print("Children's category! 10-14 years.");
			}
			
			else if(age >= 15 && age <= 17)	{
				System.out.print("You are young! 15-17 years.");
			}
			
			else if(age >= 18 && age <= 25)	{
				System.out.print("You are old, haha! 18-25 years.");	
			}
			else {
				System.out.print("Oops! Try 10-25 years.");
			}
			
		read.close();
	}
}
