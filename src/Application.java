import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("-------Menu-------");
            System.out.println("1: Gestion des classes");
            System.out.println("2: Gestion des Apprenants");
            System.out.println("3: Gestion des Formateurs");
            System.out.println("4: Quitter");
            System.out.println(" entrer un choix: ");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    Class.GestionClasses();
                    break;
                case 2:
                    Apprenant.GestionApprenants();
                    break;
                case 3:
                    Formateur.GestionFormateurs();
                    break;
            }
        }while (choix != 4);
    }
}
