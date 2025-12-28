package ex1;

public class GestionBibliotheque {
    public static void main(String[] args) {

        Adherent unAdherent = new Adherent(
                "Dupont", "Jean", "jean.dupont@email.com", "0612345678", 25, 101
        );

        Auteur unAuteur = new Auteur(
                "Hugo", "Victor", "v.hugo@academie.fr", "0100000000", 60, 505
        );

        Livre unLivre = new Livre(978225, "Les Misérables", unAuteur);

        System.out.println(unAdherent.toString());
        System.out.println();
        System.out.println(unLivre.toString());
    }
}