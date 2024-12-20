import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    public static void GestionClasses() {
    Scanner scan = new Scanner(System.in);
    int choix;
    do {
        System.out.println("------- Gestion des Classes-------");
        System.out.println("1: Création dʼune classe");
        System.out.println("2: Modification des informations dʼune classe");
        System.out.println("3: Suppression dʼune classe:");
        System.out.println("4: Affichage des détails dʼune classe");
        System.out.println(" entrer un choix: ");
        choix = scan.nextInt();
        switch (choix) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }while (choix != 4);
}
    private String NomClass;
    private Formateur formateur;
    ArrayList<String> Apprenant = new ArrayList<>();

    public Class(String nomClass, Formateur formateur, ArrayList<String> apprenant) {
        NomClass = nomClass;
        this.formateur = formateur;
        Apprenant = apprenant;
    }

    public String getNomClass() {
        return NomClass;
    }

    public void setNomClass(String nomClass) {
        NomClass = nomClass;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<String> getApprenant() {
        return Apprenant;
    }

    public void setApprenant(ArrayList<String> apprenant) {
        Apprenant = apprenant;
    }
}
