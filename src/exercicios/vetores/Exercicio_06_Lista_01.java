package exercicios.vetores;

import java.util.Scanner;

public class Exercicio_06_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String[] vetorNomes = new String[n];
		int[] vetorIdades = new int[n];
		
		for(int i = 0; i < n ; i++) {
			vetorNomes[i] = input.next();
			vetorIdades[i] = input.nextInt();
		}
		
		String maisVelho = "-";
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(vetorIdades[i] > maior) {
				maior = vetorIdades[i];
				maisVelho = vetorNomes[i];				
			}
		}
		
		System.out.println("Pessoa mais velha: " + maisVelho);
		
		input.close();

	}

}
