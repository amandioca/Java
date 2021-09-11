package vectorsMatrix;

import java.util.Scanner;

public class exercise01 {
	
	public static void main(String[] args) {
		
		int vector[] = new int [5];
		int i, more = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the...");
		
		for(i = 0; i < 5; i++) {
			
			System.out.print((i + 1) + "st value: ");
			vector[i] = scan.nextInt();
			
			if(vector[i] > more) {
				more = vector[i];				
			}
		}
		scan.close();
		System.out.println("The greatest value: " + more);
	
	}
}
