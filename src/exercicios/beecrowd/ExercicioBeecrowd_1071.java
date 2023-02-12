package exercicios.beecrowd;

import java.util.Scanner;

public class ExercicioBeecrowd_1071 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int somaImpar = 0;
		int maior = 0;
		int menor = 0;		
		
		if(x > y)  {
			maior = x;
			menor = y;
		}else {
			maior = y;
			menor = x;
		}
		
		for(int i = menor + 1; i < maior; i++) {
			if(i%2 != 0) {
				somaImpar +=i;
			}					
		}
		
		System.out.println(somaImpar);	
		
		input.close();
	}
}
