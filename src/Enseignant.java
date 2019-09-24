public class Enseignant {

    private boolean estProf;   // Est un professeur ou un intervenant
    private String nom;
    private String prenom;
    private String matiere;
    private int nb_heures;

    private static int SALAIRE_HORAIRE = 30;
    private static int SALAIRE_ANNUEL_PROF = 2000 * 12;
    private static int TOUCHE_INDEMNITE = 200;

    /**
     * Constructeur d'un Enseignant
     * @param prof boolean indiquant si l'enseignant est un professeur ou un intervenant
     * @param n nom de l'enseignant
     * @param p prenom de l'enseignant
     * @param m matiere de l'enseignant
     * @param nbh nombre d'heures de l'enseignant
     */
    public Enseignant(boolean prof, String n, String p, String m, int nbh) {
        this.estProf = prof;
        this.nom = n;
        this.prenom = p;
        this.matiere = m;
        this.nb_heures = nbh;
    }

    /**
     * Getter sur la matiere enseignee
     * @return matiere enseignee
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * Getter sur le salaire annuel de l'enseignant
     * @return salaire annuel de l'enseignant
     */
    public int getSalaireAnnuel() {
        if(estProf){
            int indemnite = 0;  // 30 euros par heure en plus
            if(nb_heures > TOUCHE_INDEMNITE){
                indemnite = nb_heures - TOUCHE_INDEMNITE * SALAIRE_HORAIRE;
            }
            return SALAIRE_ANNUEL_PROF + indemnite;
        }
        else {  // Intervenant
            return nb_heures * 2;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(estProf){
            str.append("Professeur ");
        }
        else {
            str.append("Intervenant ");
        }
        str.append(prenom + " ");
        str.append(nom + " ");
        str.append("en " + matiere);
        str.append(", salaire = " + getSalaireAnnuel() + "\n");
        return str.toString();
    }

}
