package introductionJava;

import java.util.Scanner;

public class questao1 {
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/
	
	public static void main(String[] args)	{
		
		int anos, meses, dias, umAno = 365, umMes = 30;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos calcular sua idade em dias? Para começarmos, responda:");
		
		System.out.print("Quantos anos? ");
		anos = ler.nextInt();
		
		System.out.print("Quantos meses? ");
		meses = ler.nextInt();
		
		System.out.print("Quantos dias? ");
		dias= ler.nextInt();
		
		anos *= umAno;
		meses *= umMes;
		
		dias += anos + meses;
		
		System.out.println("Sua idade convertida em dias é: " + dias);
		
		ler.close();

	}
}
