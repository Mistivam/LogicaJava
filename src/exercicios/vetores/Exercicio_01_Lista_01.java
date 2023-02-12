package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] vetor = new double[n];
		
		double maior = Double.MIN_NORMAL;
		double posicao = 0;			
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
			
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);

		input.close();		

	}

}
