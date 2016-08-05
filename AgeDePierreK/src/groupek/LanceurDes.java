package groupek;

import java.util.Random;

public class LanceurDes {

	    private int max = 6;// 6 le nombre max d'un dès
	    private int min = 1;// 1 le nombre min d'un dès

	    /**
	     * générer un numero aléatoire en 1 et 6
	     * @return numero entier entre 1 et 6
	     */
	    public int genererNumeroAleatoire() {
	        Random rand = new Random();
	        int nombreAleatoire = rand.nextInt(max - min + 1) + min;

	        return nombreAleatoire;
	    }

	    /**
	     * lancer des dès
	     * @param zone la zone concerné par le lancement de dès
	     * @param nombreFigurinePose nombre de figurines posées
	     * @return somme des resulat des dès lancé
	     */
	    public int lancerDes(ZoneRessource zone, int nombreFigurinePose) {
	        int sommeDes = 0;
	        for (int i = 0; i < nombreFigurinePose; i++) {
	            int unDes = genererNumeroAleatoire();
	            sommeDes = sommeDes + unDes;
	        }

	        return sommeDes;
	    }

	    /**
	     * lancer des dès
	     * @param zoneChasse la zone chasse concerné par le lancement de dès
	     * @param nombreFigurinePose nombre de figurines posées
	     * @return somme des resulat des dès lancé
	     */
	    public int lancerDes(ZoneChasse zoneChasse, int nombreFigurinePose) {
	        int sommeDes = 0;
	        for (int i = 0; i < nombreFigurinePose; i++) {
	            int unDes = genererNumeroAleatoire();
	            sommeDes = sommeDes + unDes;
	        }

	        return sommeDes;
	    }

	    /**
	     * recuperer des ressources
	     *
	     * @param zone     la zone sur laquel on a posé des figurines
	     * @param sommeDes somme des des lancé
	     * @return nombre de ressources gagnés
	     */
	    public Ressource recupererMatierePremiere(ZoneRessource zone, int sommeDes) {

	        int nombreRessource = Math.round(sommeDes / zone.getDevisionDes());

	        //on diminue le nombre de ressources restante dans la zone ressource
	        zone.diminuerNombreRessource(nombreRessource);

	        return new Ressource(zone.getTypeRessource(), nombreRessource);
	    }

	    /**
	     * recuperer des ressources
	     *
	     * @param zone     la zone sur laquel on a posé des figurines
	     * @param sommeDes somme des des lancé
	     * @return nombre de ressources gagnés
	     */
	    public Ressource recupererNourriture(ZoneChasse zone, int sommeDes) {

	        int nombreRessource = Math.round(sommeDes / zone.getDevisionDes());

	        return new Ressource(zone.getTypeRessource(), nombreRessource);
	    }
	}