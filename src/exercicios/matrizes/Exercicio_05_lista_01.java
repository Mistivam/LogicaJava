package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio_05_lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();

		int[][] matrizA = new int [m][n];
		int[][] matrizB = new int [m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrizA[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrizB[i][j] = input.nextInt();
			}
		}
		
		int[][] matrizC = new int [m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrizC [i][j] = matrizA[i][j] + matrizB[i][j];
				
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}		
		
		input.close();

	}

}
