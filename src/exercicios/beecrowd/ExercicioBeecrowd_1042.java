package exercicios.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class ExercicioBeecrowd_1042 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a < b && a < c ) {
			System.out.println(a);
			 if (b < c) {
				System.out.println(b);
				System.out.println(c);
			}else {
				System.out.println(c);
				System.out.println(b);
			}
			
		}
		
		if (b < a && b < c ) {
			System.out.println(b);
			 if (a < c) {
				System.out.println(a);
				System.out.println(c);
				
			}else {
				System.out.println(c);
				System.out.println(a);
			}
			
		}
		
		if (c < b && c < a ) {
			System.out.println(c);
			 if (b < a) {
				System.out.println(b);
				System.out.println(a);
			}else {
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

		input.close();

	}

}
