import java.util.ArrayList;
import java.util.Scanner;

public class Class extends Personne {

    private static ArrayList<Classe> classes = new ArrayList<>();

    public static void GestionClasses() {
        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("------- Gestion des Classes -------");
            System.out.println("1: Créer une classe");
            System.out.println("2: Modifier une classe");
            System.out.println("3: Supprimer une classe");
            System.out.println("4: Afficher les classes");
            System.out.print("Entrer un choix: ");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    creationClasse();
                    break;
                case 2:
                    modificationClasse();
                    break;
                case 3:
                    suppressionClasse();
                    break;
                case 4:
                    affichageClasses();
                    break;
            }
        } while (choix != 4);
    }


    private static void creationClasse() {
        Scanner scan = new Scanner(System.in);


        System.out.print("Nom de la classe: ");
        String nomClasse = scan.nextLine();


        System.out.print("Nom du formateur: ");
        String nomFormateur = scan.nextLine();
        System.out.print("Prénom du formateur: ");
        String prenomFormateur = scan.nextLine();

        Formateur formateur = new Formateur(nomFormateur, prenomFormateur, nomClasse);

        Classe classe = new Classe(nomClasse, formateur);
        classes.add(classe);
    }



    public static class Formateur extends Personne {
        private String nom;
        private String prenom;
        private String nomClasse;

        public Formateur(String nom, String prenom, String nomClasse) {
            this.nom = nom;
            this.prenom = prenom;
            this.nomClasse = nomClasse;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getNomClasse() {
            return nomClasse;
        }
    }

    public static class Classe {
        private String nomClasse;
        private Formateur formateur;
        private ArrayList<Apprenant> apprenants = new ArrayList<>();

        public Classe(String nomClasse, Formateur formateur) {
            this.nomClasse = nomClasse;
            this.formateur = formateur;
        }

        // Getters et Setters
        public String getNomClasse() {
            return nomClasse;
        }

        public void setNomClasse(String nomClasse) {
            this.nomClasse = nomClasse;
        }

        public Formateur getFormateur() {
            return formateur;
        }

        public void setFormateur(Formateur formateur) {
            this.formateur = formateur;
        }

        public ArrayList<Apprenant> getApprenants() {
            return apprenants;
        }

        public void ajouterApprenant(Apprenant apprenant) {
            apprenants.add(apprenant);
        }

        public void supprimerApprenant(Apprenant apprenant) {
            apprenants.remove(apprenant);
        }
    }
}
