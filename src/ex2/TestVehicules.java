package ex2;

public class TestVehicules {
    public static void main(String[] args) {

        Voiture maVoiture = new Voiture("Sedan Sport", 25000, "Model S", 2022);
        maVoiture.emettreSon();
        maVoiture.afficherInformations();

        Moto maMoto = new Moto("Course Rapide", 15000, "Yamaha", 200);
        maMoto.emettreSon();
        maMoto.afficherInformations();

        Avion monAvion = new Avion("Boeing 747", 150000000, "Air France", 900);
        monAvion.emettreSon();
        monAvion.afficherInformations();
    }
}