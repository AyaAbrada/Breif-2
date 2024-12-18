import java.util.ArrayList;

public class Class {
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
