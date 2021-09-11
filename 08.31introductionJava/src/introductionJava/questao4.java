package introductionJava;

import java.util.Scanner;

public class questao4 {
	
	/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	calcule a seguinte expressão: (img)*/

	public static void main(String[] args)	{
		
		double a, b, c, d, r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Dê os valores para calcular a equação:\n"
				+ "Valor de A: " );
		a = ler.nextDouble();
		
		System.out.print("Valor de B: ");
		b = ler.nextDouble();
		
		System.out.print("Valor de C: ");
		c = ler.nextDouble();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = ((r + s) / 2);
		
		System.out.print("O resultado é: " + d);
					
		ler.close();
			
	}

}
