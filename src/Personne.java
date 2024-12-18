public  abstract class Personne {
    private int ID;
    private String Nom;
    private String Prénom;
    private String Email;

    public Personne(int ID, String nom, String prénom, String email) {
        this.ID = ID;
        Nom = nom;
        Prénom = prénom;
        Email = email;
    }

    public Personne() {
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
}
