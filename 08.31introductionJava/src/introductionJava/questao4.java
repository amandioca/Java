package introductionJava;

import java.util.Scanner;

public class questao4 {
	
	/*Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
	calcule a seguinte express�o: (img)*/

	public static void main(String[] args)	{
		
		double a, b, c, d, r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("D� os valores para calcular a equa��o:\n"
				+ "Valor de A: " );
		a = ler.nextDouble();
		
		System.out.print("Valor de B: ");
		b = ler.nextDouble();
		
		System.out.print("Valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = ((r + s) / 2);
		
		System.out.print("O resultado �: " + d);
					
		ler.close();
			
	}

}
