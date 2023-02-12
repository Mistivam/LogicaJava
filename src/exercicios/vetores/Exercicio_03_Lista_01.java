package exercicios.vetores;

import java.util.Scanner;

public class Exercicio_03_Lista_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		for(int i = 0; i < n; i++) {
			vetorA[i] = input.nextInt();			
		}
		
		for(int i = 0; i < n; i++) {
			vetorB[i] = input.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i]+ vetorB[i];
		}
		
		for(int soma: vetorC) {
			System.out.print(soma + "\t");
		}		
		
		input.close();

	}

}
