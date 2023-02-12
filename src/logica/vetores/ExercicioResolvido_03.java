package logica.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();		
		double somaAltura = 0;
		double menorDeIdade = 0;
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(int i = 0; i < n; i++) {
			nomes[i] = input.next();//esse input.next() me driblou aqui
			idades[i] = input.nextInt();			
			alturas[i] = input.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				menorDeIdade++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			somaAltura += alturas[i];
		}	
		

		double media = somaAltura/n;
		double porcentagem = (menorDeIdade/n)*100;
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagem);
		
		input.close();

	}

}
