package introductionJava;

import java.util.Scanner;

public class questao3 {
	
	/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	public static void main(String[] args)	{
		
		int segundos, min, h, segs;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Vamos calcular a dura��o do evento? Para come�ar, responda:\n\n"
				+ "Quantos segundos durou o evento? ");
		segundos = ler.nextInt();
		
		//1h = 3600s
		
		h = segundos / 3600;
		min = (segundos % 3600) / 60;
		segs = (segundos % 3600) % 60;
		
		System.out.print("\nO evento durou " + h + ":" + min + ":" + segs + ".");
		
		ler.close();
		
	}

}
