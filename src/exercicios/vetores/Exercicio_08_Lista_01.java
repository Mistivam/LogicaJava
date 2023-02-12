package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		double[] vetorAltura = new double[n];
		String[] vetorGenero = new String[n];
		
		for(int i = 0; i < n; i++) {
			vetorAltura[i] = input.nextDouble();
			vetorGenero[i] = input.next();
		}
		
		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Double.MAX_VALUE;
		double somaAlturaMulhres = 0;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		
		for(int i = 0; i < n; i++) {
			if(vetorAltura[i] > maiorAltura) {
				maiorAltura = vetorAltura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(vetorAltura[i] < menorAltura) {
				menorAltura = vetorAltura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if (vetorGenero[i].equalsIgnoreCase("m")) {
				qtdHomens++;
			}else if(vetorGenero[i].equalsIgnoreCase("f")) {
				somaAlturaMulhres += vetorAltura[i];
				qtdMulheres++;
			}
		}
		double mediaAlturaMulhres = somaAlturaMulhres/qtdMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média altura das mulhres = %.2f%n", mediaAlturaMulhres);
		System.out.print("Numero de homens = " + qtdHomens);		
		
		input.close();

	}

}
