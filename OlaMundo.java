package testecodigo;
import java.util.ArrayList;
import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> YearsOld = new ArrayList<>();
        ArrayList<Integer> Identification = new ArrayList<>(); 
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Nome da pessoa: ");
            String nome = input.nextLine();
            System.out.print("Idade da pessoa: ");
            int idade = input.nextInt();
            System.out.print("Identidade: nº ");
            int ident = input.nextInt();
            input.nextLine();

            nameList.add(nome);
            YearsOld.add(idade);
            Identification.add(ident);

        }
        for(int i = 0; i < nameList.size(); i++) {
            System.out.printf("%d. %s | %d anos | Nº %d", i+1, nameList.get(i), YearsOld.get(i), Identification.get(i));
            System.out.println();
        }
        
        input.close();
    }
}
