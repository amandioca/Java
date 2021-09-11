package decisionLoop;

import java.util.Arrays;
import java.util.Scanner;

public class questao2 {
	
	public static void main(String[] args)	{
		
		int num1, num2, num3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		num1 = read.nextInt();
		num2 = read.nextInt();		
		num3 = read.nextInt();
		
		int[] array = {num1, num2, num3};
		
		Arrays.sort(array);
		
		System.out.println("The order entered was: " + num1 + ", " + num2 + ", " + num3);
		System.out.print("The ascending order is: " + Arrays.toString(array));
	
		read.close();
		
	}
}
