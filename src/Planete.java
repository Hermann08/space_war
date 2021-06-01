import java.awt.image.TileObserver;

public class Planete {
    static String forme;
    static int nbPlanetDecouvertes;
    String nom;
    long diametre;
    int totalHumains;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;

    public Planete(){
        nbPlanetDecouvertes++;
    }
    public Planete(String nom){
        this.nom=nom;
    }


    void revolution() {
        System.out.println("je suis " + nom + " et je tourne autoure de mon étoile");
    }

    void rotation() {
        System.out.println("je suis " + nom + " et je tourne autour de moi même.");
    }

    int tourner(int angle) {
        int nbtours = angle / 360;
        return nbtours;
    }
    /*
            void acceuillirVaisseau( int nouveauxHumains) {
                totalHumains = totalHumains + nouveauxHumains;

            }

           void acceuillirVaisseau(String typeVaisseau ){
               if (typeVaisseau.equals("CHASSEUR")) {
                   totalHumains = totalHumains + 3;
               }
               else if (typeVaisseau.equals("FREGATE")) {
                   totalHumains = totalHumains + 12;
               }
               else if (typeVaisseau.equals("CROISEUR")) {
                   totalHumains = totalHumains + 50;
               }
       */

    static String expanssion(double distance) {
        if (distance < 14) {
            return  "oh lala mais c'est super rapide";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière";
        }
    }

}





