package exercicios;

import java.util.Scanner;

public class Modulo_05_Exercicio_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();		
		int soma = 0;
		
		for(int i = 0; i < n; i++) {			
			int x = input.nextInt();
			soma += x;
		}
		
		System.out.println(soma);		
		
		input.close();
	}

}
