package logica.matrizes;

import java.util.Locale;
import java.util.Scanner;

/*Matrizes são: * 
 * indexadas, bidimensionais e homogênas
 * Exemplo: 
 * double[][] matriz = new double[3][4], matriz de 3 linhas e 4 colunas;
 * matriz[1][2] = 10 "linha 1, coluna 2 recebe 10" * 
 * */

public class TestaMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < m; i++) {			
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		input.close();

	}

}
