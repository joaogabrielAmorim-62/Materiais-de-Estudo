import java.util.Scanner;
import java.util.ArrayList;

//* MY FIRST PROJECT IN JAVA ;) */

public class EscolaNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Float> grade = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        boolean bool = true;
        float x = 0;

        while (bool == true) {
            System.out.print("1-Adicionar Aluno 2-Desempenho Turma 3-Media da turma 0-Sair: ");
            int esc = scan.nextInt();
            scan.nextLine();

            if(esc == 1) {
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Nota: ");
                float nota = scan.nextFloat();

                x += nota;
                name.add(nome);
                grade.add(nota);

            }else if(esc == 2) {
                for(int i = 0; i < name.size(); i++){
                    System.out.printf("%d. Nome: %s | Nota: %.1f%n", i+1, name.get(i), grade.get(i));
                }
            }else if(esc == 3) {
                int y = grade.size();
                float media = x / y;

                System.out.printf("MEDIA = %.1f%n", media);
            }else if(esc == 0) {
                bool = false;
            }else {
                System.out.println("Tente denovo!!!");
            }
        }
        scan.close();
    }
}
