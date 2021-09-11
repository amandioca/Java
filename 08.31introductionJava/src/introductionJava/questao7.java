package introductionJava;

import java.util.Scanner;

public class questao7 {
	
	/*Um sistema de equações lineares do tipo: (img),
	pode ser resolvido segundo mostrado abaixo: (img).
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	valores de x e y.*/
	
	public static void main(String[] args)	{
		
		int A, B, C, D, E, F, x, y;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Informe os coeficientes para encontrarmnos os valor de X e Y:\n"
				+ "A = ");
		A = ler.nextInt();
		
		System.out.print("B = ");
		B = ler.nextInt();
		
		System.out.print("C = ");
		C = ler.nextInt();
		
		System.out.print("D = ");
		D = ler.nextInt();
		
		System.out.print("E = ");
		E = ler.nextInt();
		
		System.out.print("F = ");
		F = ler.nextInt();
		
		x = ((C * E) - (B * F)) / ((A * E) - (B * D));
		y = ((A * F) - (C * D)) / ((A * E) - (B * D));
		
		System.out.print("O resustaldo é:\n" + x + "," + y +".");
		
		ler.close();
			
	}

}
