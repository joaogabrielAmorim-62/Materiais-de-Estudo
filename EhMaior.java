package testecodigo;
import java.util.Scanner;

public class EhMaior {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a > b && a > c) {
            System.out.printf("%d eh maior%n", a);
        }else if(b > a && b > c) {
            System.out.printf("%d eh maior%n", b);
        }else {
            System.out.printf("%d eh maior%n", c);
        }



        scan.close();
    }
}
