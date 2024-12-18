public class Formateur extends Personne{
    private String Spesialite;
    private Double Salaire;
    private Class classe;

    public Class getClasse() {
        return classe;
    }

    public Formateur(String spesialite) {
        Spesialite = spesialite;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }

    public Formateur(int ID, String nom, String prénom, String email, String spesialite, Double salaire, Class classe) {
        super(ID, nom, prénom, email);
        Spesialite = spesialite;
        Salaire = salaire;
        this.classe = classe;
    }

    public Formateur(String spesialite, Double salaire, Class classe) {
        Spesialite = spesialite;
        Salaire = salaire;
        this.classe = classe;
    }

    public Double getSalaire() {
        return Salaire;
    }

    public void setSalaire(Double salaire) {
        Salaire = salaire;
    }

    public String getSpesialite() {
        return Spesialite;
    }

    public void setSpesialite(String spesialite) {
        Spesialite = spesialite;
    }
}
