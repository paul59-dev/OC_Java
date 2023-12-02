public class App {
    public static void main(String[] args) throws Exception {
        Voiture voiture = new Voiture();
        voiture.start();

        Bateau bateau = new Bateau();
        bateau.start();
    }
}

class Vehicule {

    void start() {
        System.out.println("VROOOM");
    }
}

class Voiture extends Vehicule {

    @Override // preciser override pour dire que l'on vas surcharger la methode de la classe mere
    void start() {
        super.start(); // pour affichier aussi l'implementation de la classe mere 
        allumerFeux();
    }

    void allumerFeux() {
        System.out.println("Allumage feux");
    }
}

class Bateau extends Vehicule {

}
