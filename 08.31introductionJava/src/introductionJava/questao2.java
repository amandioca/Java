package introductionJava;

import java.util.Scanner;

public class questao2 {
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.*/
	
	public static void main(String[] args)	{
		
		int dias, ano, mes, dia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quer converter sua idade em dias para anos, meses e dias? Primeiro responda:\n" 
				+ "Qual sua idade em dias? ");
		dias = ler.nextInt();
				
		ano = dias / 365;
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.print("Você tem " + ano + " anos, " + mes + " meses e " + dia + " dias.");
		
		ler.close();

	}
	
}
