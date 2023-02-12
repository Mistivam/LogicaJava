package logica.vetores;

import java.util.Scanner;

public class ExemploForEach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		String[]vetor = new String[n];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextLine();
		}
		
		for (String nomes: vetor) {
			System.out.println(nomes);
		}
		
		input.close();

	}

}
