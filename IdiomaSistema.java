import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

//* By João Gabriel  */
public class IdiomaSistema {
    public static void main(String[] args){
        Date data = new Date();
        Locale loc = Locale.getDefault();
        Scanner scan = new Scanner(System.in);
        boolean bool = true;

        while (bool == true) {
            System.out.print("1-View Language 2-View Date 3-Back System: ");
            int esc = scan.nextInt();

            if(esc == 1) {
                System.out.println("Language of system is: " +loc.getDisplayLanguage());
            }else if(esc == 2){
                System.out.println("Today is: " +data.toString());
            }else if(esc == 3){
                bool = false;
            }else{
                System.out.println("Error!");
            }
        }
        scan.close();
    }
}
