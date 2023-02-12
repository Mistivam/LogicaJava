package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();
		double novoSalario , deltaPercentual, reajuste;
		
		if (salario >=0 && salario <=400) {
			novoSalario = salario * (1+0.15);
		}else if (salario <= 800) {
			novoSalario = salario * (1+0.12);
		}else if (salario <= 1200) {
			novoSalario = salario * (1+0.10);
		}else if (salario <= 2000) {
			novoSalario = salario * (1+0.07);
		}else {
			novoSalario = salario * (1+0.04);
		}
		
		deltaPercentual = ((novoSalario / salario )-1)*100;
		reajuste = novoSalario - salario;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", deltaPercentual);
		
		input.close();	

	}

}
