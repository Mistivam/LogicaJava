package logica.vetores;
//procurar manter cada parte do código responsável por apenas uma coisa  ;)

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double soma = 0;		
		
		double[] vetor = new double[n]; 
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();			
			soma+=vetor[i];
		}
		
		for(double valores: vetor) {
			System.out.printf("%.2f  ", valores);
		}
		
		double media = soma/n;
		
		System.out.println();
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);		
		
		input.close();
	}

}
