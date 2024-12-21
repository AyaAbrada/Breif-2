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
                    AssociationFormateur();
                    break;
                case 3:
                    ModifierFormateur();
                    break;
                case 4:
                    SupprimerFormateur();
                    break;
                case 5:
                    AfficherFormateurs();
                    break;
            }
        } while (choix != 4);
    }

    private String Specialite;
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

    public static void AssociationFormateur() {

    }
    public static void ModifierFormateur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez l'ID du formateur à modifier: ");
        int id = scan.nextInt();
        Formateur formateur = TrouverFormateurParId(id);  // Recherche du formateur par ID
        if (formateur != null) {
            // Modification des informations du formateur
            System.out.println("Nom actuel: " + formateur.getNom());
            System.out.print("Nouveau Nom: ");
            formateur.setNom(scan.next());

            System.out.println("Prénom actuel: " + formateur.getPrénom());
            System.out.print("Nouveau Prénom: ");
            formateur.setPrénom(scan.next());

            System.out.println("Email actuel: " + formateur.getEmail());
            System.out.print("Nouvel Email: ");
            formateur.setEmail(scan.next());

            System.out.println("Spécialité actuelle: " + formateur.getSpecialite());
            System.out.print("Nouvelle Spécialité: ");
            formateur.setSpecialite(scan.next());

            System.out.println("Salaire actuel: " + formateur.getSalaire());
            System.out.print("Nouveau Salaire: ");
            formateur.setSalaire(scan.nextDouble());

            System.out.println("Classe actuelle: " + formateur.getClasse());
            System.out.print("Nouvelle Classe: ");
            formateur.setClasse(scan.next());
        } else {
            System.out.println("Aucun formateur trouvé avec cet ID.");
        }
    }
    public static void SupprimerFormateur() {

    }
    public static void AfficherFormateurs() {
        if (formateur.isEmpty()) {
            System.out.println("Aucun formateur enregistré.");
        } else {
            for (Formateur formateur : formateur) {
                System.out.println("Nom: " + formateur.getNom() + ", Prénom: " + formateur.getPrénom() +
                        ", Email: " + formateur.getEmail() + ", Spécialité: " + formateur.getSpecialite() +
                        ", Salaire: " + formateur.getSalaire() + ", Classe: " + formateur.getClasse() + ", ID: " + formateur.getID());
            }
        }
    }

    public Formateur(String nom, String prénom, String email, String specialite, double salaire, String classe){
                super(nom, prénom, email);
                this.Specialite = specialite;
                this.Salaire = salaire;
                this.classe = classe;
            }
    private static Formateur TrouverFormateurParId(int id) {
        for (Formateur formateur : formateur) {
            if (formateur.getID() == id) {
                return formateur;
            }
        }
        return null;
    }


            public String getSpecialite () {
                return Specialite;
            }

            public void setSpecialite (String specialite){
                Specialite = specialite;
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



