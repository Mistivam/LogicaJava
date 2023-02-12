package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		double A, B, C, areaTrapezio, perimetroTriangulo;
		
		if (x1 > x2 && x1 > x3 ) {
			A = x1;
			if (x2 > x3) {
				B = x2;
				C = x3;
			}else {
				B = x3;
				C = x2;
			}
		}else if (x2 > x3) {
			A = x2;
			if (x1 > x3) {
				B = x1;
				C = x3;
			}else {
				B = x3;
				C = x1;
			}
		}else {
			A = x3;
			if (x1 > x2) {
				B = x1;
				C = x2;
			}else {
				B = x2;
				C = x1;
			}
		}
		if (A >=B+C) {
			areaTrapezio = 0.5*C*(A+B);
			System.out.printf("Area = %.1f%n", areaTrapezio);
		}else {
			perimetroTriangulo = A+ B + C;
			System.out.printf("Perimetro = %.1f%n", perimetroTriangulo);
		}

		
		input.close();

	}

}
