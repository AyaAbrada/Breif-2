import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    static ArrayList<Formateur> formateur = new ArrayList<>();
    private String Spesialite;
    private double Salaire;
    private Class classe;
    public static void GestionFormateurs() {

        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("------- Gestion des Formateurs-------");
            System.out.println("1: Ajout dʼun formateur: ");
            System.out.println("2: Association dʼun formateur à une classe:");
            System.out.println("3: Modification des informations dʼun formateur: ");
            System.out.println("4: Suppression dʼun formateur");
            System.out.println("5: Affichage des formateurs");
            System.out.println(" entrer un choix: ");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    AjouterFormateur();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    AfficherFormateur();
                    break;
            }
        } while (choix != 4);
    }


    public static void AjouterFormateur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le Nom:");
        String nom = scan.next();
        System.out.println("Entrer le Prénom:");
        String prénom = scan.next();
        System.out.println("Entrer l'Email:");
        String email = scan.next();
        System.out.println("Entrer la Spesialite");
        String spesialite = scan.next();
        System.out.println("Entrer la Salaire");
        double salaire = scan.next();
        System.out.println("Entrer le Classe");
        Class classe = scan.next();
        formateur.add(new Formateur(nom, prénom, email, spesialite, salaire, classe));
    }
    public static void AfficherFormateur() {
        for (Formateur a : formateur) {
            System.out.println(a.toString());
        }
    }

    public Formateur(String nom, String prénom, String email, String spesialite, double salaire, Class classe) {
            super(nom, prénom, email);
            Spesialite = spesialite;
            Salaire = salaire;
            this.classe = classe;

        }

        public String getSpesialite () {
            return Spesialite;
        }

        public void setSpesialite (String spesialite){
            Spesialite = spesialite;
        }

        public double getSalaire () {
            return Salaire;
        }

        public void setSalaire ( double salaire){
            Salaire = salaire;
        }

        public Class getClasse () {
            return classe;
        }

        public void setClasse (Class classe){
            this.classe = classe;
        }
    @Override
    public String toString() {
        return  " Formateur " + super.toString() +
                " Spesialite = " + Spesialite +
                " classe = " + classe +
                " Salaire = " + Salaire;

    }
    }



