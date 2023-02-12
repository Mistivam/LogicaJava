package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int soma = 0;
		int qtdPar = 0;
		
		int[]vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				soma+=vetor[i];
				qtdPar++;
			}
		}
		
		double media = soma/qtdPar;
		
		System.out.printf("%.1f%n", media);		
		
		input.close();

	}

}
