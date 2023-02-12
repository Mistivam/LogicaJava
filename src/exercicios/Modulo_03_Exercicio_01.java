package exercicios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Modulo_03_Exercicio_01 {

	public static void main(String[] args)throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);		
		
		double largura = input.nextDouble();
		double comprimento = input.nextDouble();
		double precoM2 = input.nextDouble();
		
		double area = largura*comprimento;
		double precoTotal = precoM2*area;
		
		System.out.printf("ÁREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", precoTotal);		
		
		input.close();
	}

}
