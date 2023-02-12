package exercicios.beecrowd;

import java.util.Scanner;

public class ExercicioBeecrowd_1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horaInicial = input.nextInt();
		int minutoInicial = input.nextInt();
		int horaFinal = input.nextInt();
		int minutoFinal = input.nextInt();

		contaJogo(horaInicial, horaFinal, minutoInicial, minutoFinal);
		
		input.close();

	}
	
	public static void contaJogo (int horaInicial, int horaFinal, int minutoInicial, int minutoFinal) {
		int tempoInstanteInicial = horaInicial * 60 + minutoInicial;
		int tempoInstanteFinal = horaFinal * 60 + minutoFinal;
		int duracao;
		
		if (tempoInstanteFinal > tempoInstanteInicial ) {
			duracao = tempoInstanteFinal - tempoInstanteInicial;
		}else {
			duracao = (60* 24 -tempoInstanteInicial) + tempoInstanteFinal;
		}
		
		int horas = duracao/60;
		int minutos = duracao%60;
		
		System.out.println("O JOGO DUROU "+ horas+ " HORA(S) E "+ minutos +" MINUTO(S)");		
		
	}

}
