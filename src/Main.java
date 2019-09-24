public class Main {

    /**
     * Main de l application
     * @param args Aucun argument
     */
    public static void main(String[] args) {
        Promotion promo = new Promotion("Promo L3 2018-2019");
        promo.ajouterEtudiant("Pipop", "Alexis", 21);
        promo.ajouterEtudiant("Pipop", "Julien", 21);
        promo.ajouterEtudiant("Pipop", "Reynault", 21);

        promo.ajouterEnseignant(true, "Pipop", "Maxime",
                "Trottinette", 150);
        promo.ajouterEnseignant(true, "Constant", "Mathieu",
                "Pipop", 60);
        promo.ajouterEnseignant(false, "Toutenkarton", "Pipop",
                "CKC", 1000);
        promo.ajouterEnseignant(false, "Toutenklakos", "Pipop",
                "CKC", 1000);

        System.out.println(promo.getNom_promo());
        System.out.println(promo.toStringEtudiants());
        System.out.println(promo.toStringEnseignants());
        System.out.println(promo.enseignantsParMatiere());
    }

}
