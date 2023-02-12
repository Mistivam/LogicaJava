package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int hora = n/3600;
		int minutos = (n/60)%60;		
		int segundos = n%60;
		
		
		System.out.println(hora + ":" + minutos + ":" + segundos);	
		
		input.close();

	}

}
