package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio_04_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i !=j && j > i) {
					soma += matriz[i][j];
				}			
			}
		}
		
		System.out.println(soma);
		
		input.close();

	}

}
