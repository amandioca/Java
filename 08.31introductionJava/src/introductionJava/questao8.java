package introductionJava;

import java.util.Scanner;

public class questao8 {
	
	/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.*/
		
	public static void main(String[] args)	{
		
		double custoF, custoC;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Para calcular o custo ao consumidor insira:\n"
				+ "Custo de f�brica: ");
		custoF = ler.nextDouble();
		
		custoC = custoF + ((custoF * 0.28) * 0.45);
		
		System.out.print("O custo ao consumidor � de: " + custoC);
		
		ler.close();
				
	}

}
