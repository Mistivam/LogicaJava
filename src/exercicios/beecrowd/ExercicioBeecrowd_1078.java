package exercicios.beecrowd;
//tabuada

import java.util.Scanner;

public class ExercicioBeecrowd_1078 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 1; i <=10; i++) {
			int multiplica = n*i;
			System.out.println(i + " x "+ n + " = " + multiplica);
		}
		
		input.close();
	}
}
