package exercicios.beecrowd;

import java.util.Scanner;

public class ExercicioBeecrowd_1113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		int a = 0;
		int b = 1;
		
		while (a !=b) {
			
			a = input.nextInt();
			b = input.nextInt();
			
			if (a > b) {
				System.out.println("Decrescente");
			}else if (a < b) {
				System.out.println("Crescente");
			}else {
				
			}
		}
		
		input.close();
	}
}
