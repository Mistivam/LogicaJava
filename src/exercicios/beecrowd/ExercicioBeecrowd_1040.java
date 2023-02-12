package exercicios.beecrowd;
//testar com float depois ;)

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioBeecrowd_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        

        double media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;

        System.out.println("Media: "+decimalFormat.format(media));

        if (media>=7){
            System.out.println("Aluno aprovado.");            
        } else if (media<5) {
            System.out.println("Aluno reprovado.");
        } else if (media>=5 && media <7) {
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            System.out.println("Nota do exame: "+decimalFormat.format(notaExame));
            double mediaFinal = (media + notaExame)/2;
            if (mediaFinal>=5){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+decimalFormat.format(mediaFinal));
            }else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: "+decimalFormat.format(mediaFinal));
            }
        }


        input.close();
    }
}