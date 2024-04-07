import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur son nom
        System.out.print("Entrez votre nom : ");
        String name = scanner.nextLine();
        
        // Afficher un message de salutation
        System.out.println("Bonjour, " + name + " !");
        
        // Fermer le scanner
        scanner.close();
    }
}

