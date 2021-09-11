package vectorsMatrix;

import java.util.Scanner;

public class exercise02 {
	
	public static void main(String[] args) {
	
		int bids[] = new int [5], more = 0, qty = 0;
		double mean = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Roll the dice!");
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print((i + 1) + "st throw: ");
			bids[i] = scan.nextInt();
			
			mean += bids[i];
			
			if(bids[i] >= more) {
				if(bids[i] == more) {
					qty++;					
				}
				
				else{
					more = bids[i];
					qty = 1;
				}
			}	
		}
		
		scan.close();	
		System.out.print("Highest bid and times: " + more + ", " + qty + "."
							+ "\nMean: " + (mean / 5));
	}	
}
