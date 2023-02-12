package logica.condicinais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double media = nota1+nota2;
		
		if (media < 60) {
			System.out.printf("NOTA FINAL: %.1f%n", media);
			System.out.println("REPROVADO");
		}else {
			System.out.printf("NOTA FINAL: %.1f%n", media);
		}

		
		input.close();

	}

}
