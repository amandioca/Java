package decisionLoop;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Double number;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		number = read.nextDouble();
		
		if(number % 2 == 0) {
			number = Math.sqrt(number);
			
			System.out.println("This number is even!\nIts square root is: " + number);
		}
		
		else if(number % 2 == 1) {
			number = Math.pow(number, 2);
			
			System.out.println("This number is odd!\nSquared is: " + number);
		}

		read.close();
				
	}
}
