package introductionJava;

import java.util.Scanner;

public class questao5 {
	
	/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	respectivamente.*/
	
	public static void main(String[] args)	{
		
		double nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira as tr�s notas\n" + "Peso 1: ");
		nota1 = ler.nextDouble();
		
		System.out.print("Peso 2: ");
		nota2 = ler.nextDouble();
		
		System.out.print("Peso 3: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		
		System.out.print("O valor da sua m�dia ponderada �: " + media);
		
		ler.close();
		
	}

}
