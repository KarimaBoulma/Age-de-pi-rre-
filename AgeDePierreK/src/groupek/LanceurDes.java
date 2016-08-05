package groupek;

import java.util.Random;

public class LanceurDes {

	    private int max = 6;// 6 le nombre max d'un d�s
	    private int min = 1;// 1 le nombre min d'un d�s

	    /**
	     * g�n�rer un numero al�atoire en 1 et 6
	     * @return numero entier entre 1 et 6
	     */
	    public int genererNumeroAleatoire() {
	        Random rand = new Random();
	        int nombreAleatoire = rand.nextInt(max - min + 1) + min;

	        return nombreAleatoire;
	    }

	    /**
	     * lancer des d�s
	     * @param zone la zone concern� par le lancement de d�s
	     * @param nombreFigurinePose nombre de figurines pos�es
	     * @return somme des resulat des d�s lanc�
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
	     * lancer des d�s
	     * @param zoneChasse la zone chasse concern� par le lancement de d�s
	     * @param nombreFigurinePose nombre de figurines pos�es
	     * @return somme des resulat des d�s lanc�
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
	     * @param zone     la zone sur laquel on a pos� des figurines
	     * @param sommeDes somme des des lanc�
	     * @return nombre de ressources gagn�s
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
	     * @param zone     la zone sur laquel on a pos� des figurines
	     * @param sommeDes somme des des lanc�
	     * @return nombre de ressources gagn�s
	     */
	    public Ressource recupererNourriture(ZoneChasse zone, int sommeDes) {

	        int nombreRessource = Math.round(sommeDes / zone.getDevisionDes());

	        return new Ressource(zone.getTypeRessource(), nombreRessource);
	    }
	}