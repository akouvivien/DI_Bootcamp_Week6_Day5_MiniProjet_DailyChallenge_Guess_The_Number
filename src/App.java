import java.util.Random;
import java.util.Scanner;

public class App {

    public static  void  choicePlay(  int n) {
        Scanner scanner = new Scanner(System.in);
        int b =3;
            System.out.println("vous avez "+b+" chances");
            
        //execution de la comparaison  
        
            int i = 1;
            do {
                System.out.println("------------------operation "+ i +" -------------------");
                System.out.print("devinez un nombre ");
                 int nombre = scanner.nextInt();

                 b--;
                 System.out.println("nombre de chances restant "+b);
                if (nombre < n) {
                    System.out.println("le Nombre est plus petit");
                    
                } 
                else if (nombre > n) {
                    System.out.println("le Nombre est plus grand");
                } 
                else  {
                    System.out.println("vous avez gagnez");
                    break;}

                i++;
            } while (i <= 3);
    }



    public static void main(String[] args) throws Exception {
        //nombre aleatoire
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println("le nombre choix par l'ordianteur est " + n);

        //choix du nombre par l'utilisateur
           choicePlay(n);
  
    }
}
