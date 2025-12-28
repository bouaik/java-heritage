package ex1;

class Livre {
    private int isbn;
    private String titre;
    private Auteur auteur;

    //
    public Livre(int isbn, String titre, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "--- ex1.Livre ---\n" +
                "ISBN: " + isbn + "\n" +
                "Titre: " + titre + "\n" +
                "Écrit par: " + auteur.toString();
    }
}