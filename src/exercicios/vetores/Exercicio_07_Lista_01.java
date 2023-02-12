package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String[] vetorNomes = new String[n];
		double[] vetorP1 = new double[n];
		double[] vetorP2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			vetorNomes[i] = input.next();
			vetorP1[i] = input.nextDouble();
			vetorP2[i] = input.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		double[] media = new double[n];
		
		for(int i = 0; i < n; i++) {
			media[i] = (vetorP1[i]+vetorP2[i])/2;		
		}
		
		for(int i = 0; i < n; i++) {
			if(media[i]>=6) {
				System.out.println(vetorNomes[i]);
			}
		}
		
		input.close();

	}

}
