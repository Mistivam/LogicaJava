package exercicios.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1038 {

	public static void main(String[] args)throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		
		int entrada = input.nextInt();
		int quantidade = input.nextInt();
		
		switch (entrada) {
		case 1:
			total = 4.0;
			break;
		case 2:
			total = 4.5;
			break;
		case 3:
			total = 5.0;
			break;
		case 4:
			total = 2.0;
			break;
		case 5:
			total = 1.5;
			break;
		default:
			break;
		}
		
		double valorTotal = quantidade*total;
		
		System.out.printf("Total: R$ %.2f%n", valorTotal);		
		
		input.close();
	}

}
