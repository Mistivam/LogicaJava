package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio_02_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		int [] vetorSoma = new int[n];
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				vetorSoma[i] += matriz[i][j];
			}
		}
		
		for(int valorVetor: vetorSoma) {
			System.out.println(valorVetor);
		}
		
		input.close();

	}

}
