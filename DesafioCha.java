package testecodigo;
import java.util.Scanner;

//*
 /*
 /* DESAFIO 2006 DO BEECROWD
 /* 
 */ 


public class DesafioCha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] respostas = new int[5];
        int x = 0;

        int T = scan.nextInt();
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();

        respostas[0] = A;
        respostas[1] = B;
        respostas[2] = C;
        respostas[3] = D;
        respostas[4] = E;

        for(int i = 0; i < 5; i++) {
            if(respostas[i] == T) {
                x += 1;
            }
        }

        System.out.println(x);

        scan.close();
    }
}
