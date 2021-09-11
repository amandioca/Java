package repeatLoop;

import java.util.Scanner;

public class exercise2 {
	
	public static void main(String[] args)	{
		
		int even = 0, odd = 0, num;
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Enter " + (i+1) + "° number: ");
			num = read.nextInt();
			
			if(num%2 == 0) {
				even++;
			}
			
			else {
				odd++;
			}			
		}
		
		read.close();
		
		System.out.print("\nEven numbers: " + even + "\nOdd numbers: " + odd);
		
	}
}
