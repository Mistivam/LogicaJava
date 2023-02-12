package logica.vetores;

import java.util.Locale;
import java.util.Scanner;

/*vetor: tamanho fixo, indexada, unidimensional e homogênea
 * também são chamados de arrays
 * quantidade fixa de posições
 */

public class TestaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
		}
		
		for(double conteudo: vetor) {
			System.out.printf("%.2f%n",conteudo);
		}		
		
		input.close();
	}

}
