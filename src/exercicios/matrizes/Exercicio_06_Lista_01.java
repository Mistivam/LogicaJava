package exercicios.matrizes;

/*6) Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.
Entrada:
A entrada contém o número inteiro N, seguido dos valores da matriz com uma casa decimal cada, seguido do índice de
uma linha, seguido do índice de uma coluna, conforma exemplo.
Saída:
A saída contém os valores de saída de cada ação, com uma casa decimal, na ordem em que foram apresentadas no
enunciado, conforme exemplo.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06_Lista_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		double[][] matriz = new double [n][n];
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				matriz [i][j] = input.nextDouble();
			}
		}
		
		int indiceLinha = input.nextInt();
		int indiceColuna = input.nextInt();
		
		double soma = 0;		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matriz[i][j] > 0) {
					soma += matriz [i][j];
				}
			}
		}
		
		System.out.print("SOMA DOS POSITIVOS: " + soma);
		
		System.out.println();
		System.out.print("LINHA ESCOLHIDA: ");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == indiceLinha) {
					System.out.print(matriz[indiceLinha][j] + " ");
				}
			}
		}
		
		System.out.println();		
		System.out.print("COLUNA ESCOLHIDA: ");		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j == indiceColuna) {
					System.out.print(matriz[i][indiceColuna] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2);
				}
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ ALTERADA:");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();

	}

}
