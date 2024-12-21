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
                    créerClasse();
                    break;
                case 2:
                    modifierClasse();
                    break;
                case 3:
                    supprimerClasse();
                    break;
                case 4:
                    afficherClasses();
                    break;
            }
        } while (choix != 4);
    }


    private static void créerClasse() {
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
    private static void modifierClasse() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nom de la classe à modifier: ");
        String nomClasse = scan.nextLine();
        Classe classe = trouverClasse(nomClasse);
        if (classe != null) {
            System.out.print("Nouveau nom de la classe: ");
            classe.nomClasse = scan.nextLine();
            System.out.println("Classe modifiée : " + classe.getNomClasse());
        } else {
            System.out.println("Classe non trouvée.");
        }
    }


    private static void supprimerClasse() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nom de la classe à supprimer: ");
        String nomClasse = scan.nextLine();
        Classe classe = trouverClasse(nomClasse);
        if (classe != null) {
            classes.remove(classe);
            System.out.println("Classe supprimée.");
        } else {
            System.out.println("Classe non trouvée.");
        }
    }

    private static void afficherClasses() {
        for (Classe classe : classes) {
            System.out.println("Classe : " + classe.getNomClasse());
            System.out.println("Formateur : " + classe.getFormateur().getNom());
        }
    }

    private static Classe trouverClasse(String nomClasse) {
        for (Classe classe : classes) {
            if (classe.getNomClasse().equals(nomClasse)) {
                return classe;
            }
        }
        return null;
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
