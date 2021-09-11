package decisionLoop;

import java.util.Scanner;

public class questao1 {
	
	public static void main (String[] args)	{
		
		int value[] = new int[3];
		int bigger = 0, i;
		
		try (Scanner read = new Scanner(System.in)){
			
			for(i = 0; i < 3; i++)	{
			
		System.out.println("Enter the " + (i + 1) + "º number: ");
				value[i] = read.nextInt(); 
				
				if(value[i] > bigger)	{
					bigger = value[i];
				}
			}	
			
			System.out.print("Among the values the highest is: " + bigger);
			
			read.close();
		}
				
	}
		
}
