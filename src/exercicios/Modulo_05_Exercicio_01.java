package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Modulo_05_Exercicio_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double idade = input.nextDouble();
		double somaIdades = 0;
		double contador = 0;		
		
		while (idade >= 0) {
			somaIdades += idade;
			contador++;
			idade = input.nextDouble();			
		}		
		
		double media = somaIdades/contador;
		
		if (contador > 0) {
			System.out.printf("%.2f%n", media);
		}else {
			System.out.println("Impossível calcular");
		}	
		
		input.close();

	}

}
