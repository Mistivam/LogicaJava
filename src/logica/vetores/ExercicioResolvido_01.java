package logica.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[]vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}
		
		input.close();
	}
}
