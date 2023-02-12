package exercicios.beecrowd;
/*tentar fazer esse exercício com mais calma,
 *  dadas as dificuldades de compilar, embora a lógica estivesse correta
 *  Se atentar para as variáveis A, B, C serem inicializadas
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1045 {

    public static void main(String[] args)throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double A, B, C;

        if (n1 > n2 && n1 > n3) {
            A = n1;
            if (n2 > n3) {
                B = n2;
                C = n3;
            }else {
                B = n3;
                C = n2;
            }
        }else if (n2 > n3) {
            A = n2;
            if (n1 > n3) {
                B = n1;
                C = n3;
            }else {
                B = n3;
                C = n1;
            }
        }else {
            A = n3;
            if (n1 > n2) {
                B = n1;
                C = n2;
            }else {
                B = n2;
                C = n1;
            }
        }

        if (A >= B+C) {
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (A*A==B*B+C*C) {
                System.out.println("TRIANGULO RETANGULO");
            }else if (A*A > B*B+C*C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if (A*A < B*B+ C*C) {
                System.out.println("TRIANGULO ACUTANGULO");

            }if (A == B && A == C ) {
                System.out.println("TRIANGULO EQUILATERO");
            }else if (A == B || A== C|| B==C) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }

        input.close();

    }

}