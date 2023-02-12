package exercicios.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String[] vetorNomeProduto = new String[n];
		double[] vetorPrecoCompra = new double[n];
		double[] vetorPrecoVenda = new double[n];
		
		for (int i = 0; i < n; i++) {
			vetorNomeProduto[i] = input.next();
			vetorPrecoCompra[i] = input.nextDouble();
			vetorPrecoVenda[i] = input.nextDouble();
		}
		
		int lucroBaixo = 0;
		int lucroMedio = 0;
		int lucroAlto = 0;
		
		for (int i = 0; i < n; i++) {
			double deltaPercentual = ((vetorPrecoVenda[i]/vetorPrecoCompra[i])-1)*100;
			
			if (deltaPercentual < 10) {
				lucroBaixo++;
			}else if(deltaPercentual >= 10 && deltaPercentual <=20) {
				lucroMedio++;
			}else {
				lucroAlto++;
			}
		}
		
		double totalCompra = 0;
		double totalVenda = 0;
		
		for (int i = 0; i < n; i++) {
			totalCompra += vetorPrecoCompra[i];
			totalVenda += vetorPrecoVenda[i];
		}
		
		double lucro = totalVenda - totalCompra;
		
		System.out.println("Lucro abaixo de 10%: " + lucroBaixo);
		System.out.println("Lucro entre 10% e 20%: " + lucroMedio);
		System.out.println("Lucro acima de 20%: "+ lucroAlto);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucro);
		
		input.close();

	}

}
