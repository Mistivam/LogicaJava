package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio_03_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		int maiorValor;
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			maiorValor = Integer.MIN_VALUE;
			for(int j = 0; j < n; j++) {				
				if (matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					vetor[i] = maiorValor;
				}
			}
		}
		
		for(int maior: vetor) {
			System.out.println(maior);
		}		
		
		input.close();

	}

}
