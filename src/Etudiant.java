public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private int no_etu;

    /**
     * Constructeur d'un Etudiant
     * @param n nom de l'etudiant
     * @param p prenom de l'etudiant
     * @param a age de l'etudiant
     * @param ne numero de l'etudiant
     */
    public Etudiant(String n, String p, int a, int ne) {
        this.nom = n;
        this.prenom = p;
        this.age = a;
        this.no_etu = ne;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Etudiant ");
        str.append(prenom + " ");
        str.append(nom + " ");
        str.append("(no_etu=");
        str.append(no_etu);
        str.append(") ");
        str.append(age);
        str.append(" ans\n");
        return str.toString();
    }
}
