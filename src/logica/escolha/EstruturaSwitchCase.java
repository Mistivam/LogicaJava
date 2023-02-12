package logica.escolha;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int escolha = input.nextInt();
		String dia;
		
		
		switch (escolha) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta ";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);

		input.close();

	}

}
