package repeatLoop;

import java.util.Scanner;

public class exercise5 {
	
	public static void main(String[] args)	{
		
		int num = 0, total = 0, qty = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter any number (0 to finish):");
		
			do {
				num = read.nextInt();				
				total += num;
				
				if(num != 0) {
				 qty++;
				}
			}
			
			while(num != 0);
		
		read.close();
		
		System.out.print("Finish!\nNumbers amount entered: " + qty 
				+ "\nNumbers sum: " + total);
		
	}	
}
