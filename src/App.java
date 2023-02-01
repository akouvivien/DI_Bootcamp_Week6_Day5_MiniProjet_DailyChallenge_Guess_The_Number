import java.util.Random;
import java.util.Scanner;

public class App {

    public static  void  choicePlay( int nombre, int n) {

        System.out.println("devinez un nombre");
        System.out.println("Votre nombre est " + nombre);
        if (nombre == n) {
            System.out.println("vous avez gagnez");
        } else  System.out.println("vous avez perdu");
    }

    public static void main(String[] args) throws Exception {
        //nombre aleatoire
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println("le nombre choix par l'ordianteur est " + n);
        //choix du nombre par l'utilisateur
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();  
        //execution de la comparaison   
        choicePlay(nombre, n);

    }

    
}
