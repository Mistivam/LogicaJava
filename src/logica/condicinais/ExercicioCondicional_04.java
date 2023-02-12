package logica.condicinais;
//operadora de telefone

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double minutos = input.nextDouble();
		double valor = 50.0;
		
		if (minutos <= 100) {
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		}else {
			valor += (2.00*(minutos-100));
			System.out.printf("Valor a pagar R$ %.2f%n", valor);
		}		
		
		input.close();		

	}

}
