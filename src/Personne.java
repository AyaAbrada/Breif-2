import java.util.Scanner;

public  abstract class Personne {
    private static int compteur=1;
    private int ID;
    private String Nom;
    private String Prénom;
    private String Email;

    public Personne( String nom, String prénom, String email) {
        this.ID = compteur;
        Nom = nom;
        Prénom = prénom;
        Email = email;
        compteur++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return
                " ID=" + ID +
                ", Nom='" + Nom + '\'' +
                ", Prénom='" + Prénom + '\'' +
                ", Email='" + Email + '\'';
    }

    public Personne(){}
}
