package exercicios.beecrowd;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1036 {

	public static void main(String[] args)throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		raiz(a, b, c);

		input.close();
	}	

	public static void raiz (double a, double b, double c) {
		double delta = Math.pow(b, 2)-4*a*c;
		if(delta > 0 && a!= 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f%n",x1);
			System.out.printf("R2 = %.5f%n",x2);
		} else {
			System.out.print("Impossivel calcular"+"\n");
		}			
	}
}
