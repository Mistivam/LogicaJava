package logica.estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class TestaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double celcius;
		String resposta;
		
		do {
			System.out.print("Digite a temperatura em Celcius: ");
			celcius = input.nextDouble();			
			double f = (1.8*celcius) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja continuar (s/n)? ");
			input.nextLine();
			resposta = input.nextLine();
		}while(resposta.equalsIgnoreCase("s"));		
		
		input.close();

	}

}
