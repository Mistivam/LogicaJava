package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double soma = 0;
		
		double[]vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
			soma += vetor[i];			
		}
		
		double media = soma/n;
		
		for (int i = 0; i< vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		input.close();

	}

}
