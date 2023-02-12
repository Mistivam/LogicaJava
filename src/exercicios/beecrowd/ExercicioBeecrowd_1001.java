package exercicios.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1001 {

	public static void main(String[] args)throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int x = a + b;
		
		System.out.println("X = "+ x);		
		
		input.close();
	}

}
