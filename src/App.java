import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner t = new Scanner(System.in);

        //a
        System.out.println("Ange avtsåndet från ditt arbetsplats: ");
        int avstånd = t.nextInt();
        System.out.println("Ange med siffror om du är 1 ensam eller 2 sambo: ");
        int es = t.nextInt();
        System.out.println("Ange hur länge du har arbetat: ");
        int arbetat = t.nextInt();
        if(avstånd>=50 && es==1 && arbetat>=1)
        {
            System.out.println("Du får skatteavdrag");
        }
        else if(avstånd>=50 && es==2 && arbetat>=3)
        {
            System.out.println("Du får skatteavdrag");
        }
        else
        {
            System.out.println("Du får inte skatteavdrag");
        }
    }
}
