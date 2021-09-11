package repeatLoop;

import java.util.Scanner;

public class exercise6 {
	
	public static void main(String[] args)	{
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		int num = 0, mean = 0, qty = 0;
	
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter any number (0 to finish):");
		
			do {
				num = read.nextInt();
				
				if(num % 3 == 0 && num != 0) {
					qty++;
					mean += num;
					
				}
			}
	
			while(num != 0);
			
			read.close();
			
			System.out.print("\nFinish!\nAverage of multiples of 3 entered: " + (mean / qty));
			
	}
}
