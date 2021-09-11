package introductionJava;

import java.util.Scanner;

public class questao5 {
	
	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.*/
	
	public static void main(String[] args)	{
		
		double nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira as três notas\n" + "Peso 1: ");
		nota1 = ler.nextDouble();
		
		System.out.print("Peso 2: ");
		nota2 = ler.nextDouble();
		
		System.out.print("Peso 3: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		
		System.out.print("O valor da sua média ponderada é: " + media);
		
		ler.close();
		
	}

}
