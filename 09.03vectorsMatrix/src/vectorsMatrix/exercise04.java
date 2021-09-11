package vectorsMatrix;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[][] matriz = new double[3][3];
		double soma = 0.0, somaDiagonal;
		double[][] matriz1 = new double[3][3]; // matriz 3x3
		double soma1 = 0.0, somaDiagonal1; // declaração de variáveis

		System.out.println("Insira os valores pra matriz:");
		for (int l = 0; l < matriz.length; l++) {
		for (int l1 = 0; l1 < matriz.length; l1++) {// esse for vai ler os valores digitados pelo usuário, preenchendo a
													// matriz

			for (int c = 0; c < matriz[l1].length; c++) {

				matriz[l1][c] = entrada.nextDouble();
				soma1 = soma1 + matriz[l1][c];
				soma1 += matriz[l1][c]; // sempre que for acrescentado um novo valor, ele vai ser acrescentado à
				// soma = soma+ matriz[l][c]; // soma
			}
		}

		somaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
		somaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2]; // a diagonal principal nessa matriz é a que está na
																	// posição 0,0; 1,1; 2,2;

		System.out.println("Soma dos valores: " + soma1 + ".");
		System.out.println("Soma da diagonal principal: " + somaDiagonal1 + ".");
		System.out.println("Soma dos valores: " + soma1 + "."); // mostra a soma
		System.out.println("Soma da diagonal principal: " + somaDiagonal1 + "."); // mostra soma da diagonal principal
		entrada.close();
			
		}	
	}
	
}