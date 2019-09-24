import java.util.ArrayList;

public class Promotion {

    private ArrayList<Etudiant> etudiants;
    private ArrayList<Enseignant> enseignants;
    private ArrayList<String> matieres;
    private String nom_promo;
    private int no_etu; // Le numero etudiant est unique. Il y aura alors une incrementation

    /**
     * Constructeur par defaut d'une promotion
     * @param nom nom de la promotion
     */
    public Promotion(String nom) {
        nom_promo = nom;
        no_etu = 1; // Le premier etudiant sera le numero 1
        etudiants = new ArrayList<>();
        enseignants = new ArrayList<>();
        matieres = new ArrayList<>();

    }

    /**
     * Getter sur le nom de la promo
     * @return nom de la promo
     */
    public String getNom_promo() {
        return nom_promo;
    }

    /**
     * Ajout d'un etudiant a la promo
     * @param nom nom de l'etudiant
     * @param prenom prenom de l'etudiant
     * @param age age de l'etudiant
     */
    public void ajouterEtudiant(String nom, String prenom, int age) {
        etudiants.add(new Etudiant(nom, prenom, age, no_etu));
        no_etu++;   // incrementation du compteur
    }

    /**
     * Ajout d'un enseignant a la promo
     * @param prof boolean indiquant si l'enseignant est un professeur ou un intervenant
     * @param nom nom de l'enseignant
     * @param prenom prenom de l'enseignant
     * @param matiere matiere enseignee par l'enseignant
     * @param nb_heures nombre d'heures de l'enseignant
     */
    public void ajouterEnseignant(boolean prof, String nom, String prenom,
                                  String matiere, int nb_heures) {
        if(!matieres.contains(matiere)){
            matieres.add(matiere);  // Ajout de la matiere dans la liste si elle n'y est pas
        }
        enseignants.add(new Enseignant(prof, nom, prenom, matiere, nb_heures));
    }

    /**
     * Mise en chaine de tous les etudiants
     * @return Chaine comportant tous les etudiants
     */
    public String toStringEtudiants() {
        StringBuilder str = new StringBuilder("Les étudiants :\n");
        for (Etudiant e: etudiants) {
            str.append(e.toString());
        }
        return str.toString();
    }

    /**
     * Mise en chaine de tous les enseignants
     * @return Chaine comportant tous les enseignants
     */
    public String toStringEnseignants() {
        StringBuilder str = new StringBuilder("Les enseignants :\n");
        for (Enseignant e: enseignants) {
            str.append(e.toString());
        }
        return str.toString();
    }

    /**
     * Mise en chaine de tous les enseignants d'une matiere
     * @param m matiere enseignee par les enseignants
     * @return Chaine comportant tous les enseignants d'une matiere
     */
    public String enseignantsDUneMatiere(String m) {
        StringBuilder str = new StringBuilder("Les enseignants en " + m + ": \n");
        for (Enseignant e: enseignants) {
            if(e.getMatiere().equals(m)) {
                str.append(e.toString());
            }
        }
        return str.toString();
    }

    /**
     * Mise en chaine de tous les enseignants par matiere
     * @return Chaine comportant tous les enseignants pour toutes les matieres
     */
    public String enseignantsParMatiere() {
        StringBuilder str = new StringBuilder("Enseignants par matière :\n");
        for(String m : matieres) {
            str.append(enseignantsDUneMatiere(m));
        }
        return str.toString();
    }
}
