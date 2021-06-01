

public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom){
        super(nom);
 }

    public void acceuillirVaisseau(Vaisseau nouveauxvaisseau) {

        if (nouveauxvaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)nouveauxvaisseau).desactiverArmes();
        }
        totalHumains = totalHumains + nouveauxvaisseau.nbPassagers;
        if (vaisseauActuellementAcoste == null) {
            System.out.println("Aucun Vaisseau ne s'en va");
        }
        else {
            System.out.println("Un Vaisseau de type" + vaisseauActuellementAcoste.type + " doit s'en aller");
        }
        vaisseauActuellementAcoste = nouveauxvaisseau;
 }


 }

