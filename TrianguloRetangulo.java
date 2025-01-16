import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();
        for(int i = 1; i <= tamanho; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
