import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    static ArrayList<Formateur> formateur = new ArrayList<>();



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
                    AfficherFormateurs();
                    break;
            }
        } while (choix != 4);
    }

    private String Spesialite;
    private double Salaire;
    private String classe;

    public static void AjouterFormateur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le Nom:");
        String nom = scan.next();
        System.out.println("Entrer le Prénom:");
        String prénom = scan.next();
        System.out.println("Entrer l'Email:");
        String email = scan.next();
        System.out.println("Entrer la Spécialité:");
        String specialite = scan.next();
        System.out.println("Entrer le Salaire:");
        double salaire = scan.nextDouble();
        System.out.println("Entrer la Classe:");
        String classe = scan.next();
        formateur.add(new Formateur(nom, prénom, email, specialite, salaire, classe));
    }
    public static void AfficherFormateurs() {
        if (formateur.isEmpty()) {
            System.out.println("Aucun formateur enregistré.");
        } else {
            for (Formateur formateur : formateur) {
                System.out.println("Nom: " + formateur.getNom() + ", Prénom: " + formateur.getPrénom() +
                        ", Email: " + formateur.getEmail() + ", Spécialité: " + formateur.getSpesialite() +
                        ", Salaire: " + formateur.getSalaire() + ", Classe: " + formateur.getClasse());
            }
        }
    }


    public Formateur(String nom, String prénom, String email, String specialite, double salaire, String classe){
                super(nom, prénom, email);
                this.Spesialite = specialite;
                this.Salaire = salaire;
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

            public String getClasse () {
                return classe;
            }

            public void setClasse (String classe){
                this.classe = classe;
            }


        }



