package logica.matrizes;

import java.util.Scanner;

public class ExercicioResolvido_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int qtdNegativo = 0;
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
			}
		}		

		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(matriz[i][j]+" ");//ou sem if e só um sysout(matriz[i][i])
				}
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					qtdNegativo++;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NEGATIVOS: " + qtdNegativo);			
		
		input.close();

	}

}
