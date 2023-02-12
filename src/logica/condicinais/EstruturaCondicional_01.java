package logica.condicinais;

import java.util.Scanner;

public class EstruturaCondicional_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		int horas = input.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}else {
			if (horas < 18) {
				System.out.println("Boa tarde!");
			}else {
				System.out.println("Boa noite!");
			}
		}
		
		
		input.close();

	}

}
