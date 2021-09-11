package introductionJava;

import java.util.Scanner;

public class questao6 {
	
	/*Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
	que efetua tal cálculo é: (img).*/
	
	public static void main(String[] args)	{
		
		double x1, x2, y1, y2, p1, p2, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Vamos calcular a distância entre dois pontos? Primeiro insira as coordenadas\n"
				+ "x1: ");
		x1 = ler.nextDouble();
		
		System.out.print("x2: ");	
		x2 = ler.nextDouble();
		
		System.out.print("y1: ");
		y1 = ler.nextDouble();
		
		System.out.print("y2: ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt(p1 + p2);
		
		System.out.print("O resultado de D é: " + d + ".");
		
		ler.close();
				
	}

}
