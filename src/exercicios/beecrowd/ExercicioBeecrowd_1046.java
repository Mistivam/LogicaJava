package exercicios.beecrowd;

import java.util.Scanner;

public class ExercicioBeecrowd_1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horaInicial = input.nextInt();
		int horaFinal = input.nextInt();
		int tempoDeJogo;
		
		if(horaInicial > horaFinal) {
			tempoDeJogo = 24 - horaInicial + horaFinal;
			System.out.println("O JOGO DUROU "+ tempoDeJogo+ " HORA(S)");
		}else if (horaInicial < horaFinal) {
			tempoDeJogo = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU "+ tempoDeJogo+ " HORA(S)");
		}else {
			tempoDeJogo = 24; 
			System.out.println("O JOGO DUROU "+ tempoDeJogo+ " HORA(S)");
		}
		
		input.close();

	}

}
