package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio_01_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++ ) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					System.out.println(matriz[i][j]);
				}
			}
		}		
		
		input.close();

	}

}
