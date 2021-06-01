public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees;

    VaisseauDeGuerre(String type) {
        this.type = type;
        if (type.equals("CHASSEUR")) {
            tonnageMax = 0;
        } else if (type.equals("FREGATE")) {
            tonnageMax = 50;
        } else if (type.equals("CROISEUR")) {
            tonnageMax = 100;
        }
    }

    void attaquer(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLattaque) {
        if (armesDesactivees) {
            System.out.println("attaque impossible, armes désactiver");

        } else {
            System.out.println("un vaisseau de type" + type + "attaque un vaisseau de type" + type);
            System.out.println("en utilisant une arme " + armeUtilisee + " pendant " + dureeDeLattaque);
            vaisseauAttaque.resistanceDuBouclier = 0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage / 2;
        }


    }

    void desactiverArmes() {
        System.out.println("desactivation d'une armes du vaisseau de type " + type);
        armesDesactivees = true;

    }

    void activerBouclier() {
        this.desactiverArmes();
        super.activerBouclier();

    }

    @Override
    int emporterCargaison(int cargaison) {
        if (type.equals("CHASSEUR")) {
            return cargaison;
        } else {
            if (nbPassagers < 12) {
                return cargaison;
            }
            else{
                int tonnagePassagers = 2 * nbPassagers;
                int tonnageRestant = tonnageMax-tonnageActuel;
                int tonnageAConsidérer = (tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison > tonnageAConsidérer) {
                    tonnageActuel =tonnageMax;
                    return  cargaison-tonnageAConsidérer;
                }
                else {
                    tonnageActuel = tonnageActuel+cargaison;
                    return 0;

                }

            }
        }
    }

}


