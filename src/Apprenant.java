import java.util.ArrayList;
import java.util.Scanner;
public class Apprenant extends Personne{
    static ArrayList<Apprenant> apprenants = new ArrayList<>();

    public Apprenant(String nom, String prénom, String email){
        super(nom, prénom, email);

    }

    public Apprenant(ArrayList<Apprenant> apprenants, Class classe, ArrayList<Double> note) {
        this.apprenants = apprenants;
        this.classe = classe;
        Note = note;
    }

    public static void GestionApprenants() {
        Scanner scan = new Scanner(System.in);
        int choix;
        do {
            System.out.println("-------Gestion des Apprenants-------");
            System.out.println("1: Ajout dʼun apprenant");
            System.out.println("2: Association dʼun apprenant à une classes");
            System.out.println("3: Modification des informations dʼun apprenant");
            System.out.println("4: Suppression dʼun apprenant");
            System.out.println("5-Affichage des apprenants:");
            System.out.println(" entrer un choix: ");
            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    AjouterApprenant();
                    break;
                case 2:
                    AssociationUnApprenant();
                    break;
                case 3:
                    ModifierUnApprenant();
                    break;
                case 4:
                    SuppresionDunApprenant();
                    break;
                case 5 :
                    AfficherApprenant();
                    break;
            }
        }while (choix != 5);

    }
    public static void AjouterApprenant(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer le Nom:");
        String nom = scan.next();
        System.out.println("Entrer le Prénom:");
        String prénom = scan.next();
        System.out.println("Entrer l'Email");
        String email = scan.next();
        apprenants.add(new Apprenant(nom,prénom,email));
    }
    public static void AssociationUnApprenant(){

    }

    public static void ModifierUnApprenant() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Entrez l'ID de l'apprenant à modifier: ");
            int id = scan.nextInt();
            Apprenant apprenant = TrouverApprenantParId(id);
            if (apprenant != null) {
                System.out.println("Modifiez les informations de l'apprenant:");
                System.out.println("Nom actuel: " + apprenant.getNom());
                System.out.print("Nouveau Nom: ");
                apprenant.setNom(scan.next());

                System.out.println("Prénom actuel: " + apprenant.getPrénom());
                System.out.print("Nouveau Prénom: ");
                apprenant.setPrénom(scan.next());

                System.out.println("Email actuel: " + apprenant.getEmail());
                System.out.print("Nouvel Email: ");
                apprenant.setEmail(scan.next());

            } else {
                System.out.println("Aucun apprenant trouvé avec cet ID.");
            }


    }

    public static void SuppresionDunApprenant() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez l'ID de l'apprenant à supprimer: ");
        int id = scan.nextInt();
        Apprenant apprenant = TrouverApprenantParId(id);
        if (apprenant != null) {
            apprenants.remove(apprenant);
            System.out.println("Apprenant supprimé");
        } else {
            System.out.println("Aucun apprenant trouvé avec cet ID.");
        }
    }

    public static void AfficherApprenant() {
        if (apprenants.isEmpty()) {
            System.out.println("Aucun aprenant enregistré.");
        } else {
            for (Apprenant apprenant : apprenants) {
                System.out.println("Nom: " + apprenant.getNom() + ", Prénom: " + apprenant.getPrénom() +
                        ", Email: " + apprenant.getEmail() + ", Classe: " + apprenant.getClasse() + ", ID: " + apprenant.getID());
            }
        }
    }

    private Class classe;

    public Apprenant( String nom, String prénom, String email,Class classe) {
        super( nom, prénom, email);
        this.classe=classe;
    }

    public Apprenant() {
    }
    private static Apprenant TrouverApprenantParId(int id) {
        for (Apprenant apprenant : apprenants) {
            if (apprenant.getID() == id) {
                return apprenant;
            }
        }
        return null;
    }

    public Class getClasse() {
        return classe;
    }


    public void setClasse(Class classe) {
        this.classe = classe;
    }

    ArrayList<Double> Note = new ArrayList<>();

    public ArrayList<Double> getNote() {
        return Note;
    }

    public void setNote(ArrayList<Double> note) {
        Note = note;
    }

}

