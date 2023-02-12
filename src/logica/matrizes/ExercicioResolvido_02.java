package logica.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		double[][] matriz = new double[m][n];
		double[] vetor = new double[m];
		
		for(int i = 0; i <m; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = input.nextDouble();				
			}
		}
		
		
		double soma = 0;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				
				soma += matriz[i][j];
				vetor[i] = soma;
			}			
			soma = 0;
		}
		
		for(double contador: vetor) {
			System.out.printf("%.1f%n", contador);
		}		
		
		input.close();
	}

}
