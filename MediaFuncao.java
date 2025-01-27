package testecodigo;
import java.util.Scanner;

class Soma {
    
    public static double media(double n1, double n2, double n3, double n4) {
        double x = (n1+n2+n3+n4) / 4;
        return x;

    }
}
class Recuperacao {

    public static double recup(double rec, double notFin) {
        double notaRecFinal = (rec+notFin) / 2;
        return notaRecFinal;

    }
}

public class MediaFuncao {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double finalMedia = Soma.media(nota1, nota2, nota3, nota4);

        System.out.printf("Media do aluno -> %.2f", finalMedia);
        System.out.println();

        if(finalMedia >= 6.0) {

            System.out.println("Aprovado");

        }else if(finalMedia >= 5.0 && finalMedia < 6.0) {

            System.out.println("Aluno de prova final");

            double notaFinal = scan.nextDouble();
            double finalRecup = Recuperacao.recup(notaFinal, finalMedia);
            System.out.printf("Nota final -> %.2f", finalRecup);
            System.out.println();

            if(finalRecup >= 6.0) {

                System.out.println("Aprovado com recuperação");

            }else {

              
                System.out.println("Reprovado");

            }
        }else {

            System.out.println("Reprovado");
        }

        scan.close();
    
    }
}
