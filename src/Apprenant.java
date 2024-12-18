import java.util.ArrayList;

public class Apprenant extends Personne{
    private Class classe;

    public Apprenant(int ID, String nom, String prénom, String email,Class classe) {
        super(ID, nom, prénom, email);
        this.classe=classe;
    }

    public Apprenant() {

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
