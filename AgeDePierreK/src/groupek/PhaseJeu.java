package groupek;

import groupek.CabaneAOutils;
import groupek.Ferme;
import groupek.Hutte;
import groupek.Lieu;
import groupek.ZoneChasse;
import groupek.ZoneRessource;

public class PhaseJeu {

    public LanceurDes lanceurDes = new LanceurDes();
    /**
     * placer des figurines dans le lieu(Ferme, Hutte, Cabane � outils)
     * @param lieu lieu(Ferme, Hutte, Cabane � outils)
     * @param nombreFigurine nombre d'figurines
     */
    public void placerfigurine(Lieu lieu, Joueur joueur, int nombreFigurine) {
        
        if(lieu.isOccupee()) {
            System.out.println("Le lieu est occup�e");
            return;
        }
        if(nombreFigurine > lieu.getNombrePlaceDisponible()) {
            System.out.println("Le nombre de place disponible est inf�rieur au nombre d figurine � placer");
            System.out.println("Vous avez le droit de d�poser" + lieu.getNombrePlaceDisponible() + "figurine");
            return;
        }
        //rendre le lieu occup�e
        lieu.setOccupee(true);
        joueur.deminuerNombrefigurine(nombreFigurine);
        //d�minuer le nombre de place disponible du lieu
        lieu.deminuerNombreDePlaceDisponible(nombreFigurine);
        lieu.setCouleurFigurinesPlace(joueur.getCouleur());
        lieu.setNbFigurinesPlaces(nombreFigurine);
    }

    /**
     * placer des figurine dans les zones ressource (Foret, Glisi�re, Rivi�re et Carri�re)
     * @param zoneRessource
     * @param joueur
     * @param nombreFigurine
     */
    public void placerfigurine(ZoneRessource zoneRessource, Joueur joueur, int nombreFigurine) {
        if (zoneRessource.isOccupee()){
            System.out.println("Le lieu est occup�e");
            return;
        }
        zoneRessource.setOccupee(true);
        zoneRessource.diminuerNombreRessource(nombreFigurine);
        joueur.deminuerNombrefigurine(nombreFigurine);
        zoneRessource.setCouleurFigurinesPlace(joueur.getCouleur());
        zoneRessource.setNbFigurinesPlaces(nombreFigurine);

    }

    /**
     * placer des figurine dans le zone chasse
     * @param zoneChasse
     * @param joueur
     * @param nombrefigurine
     */
    public void placerfigurine(ZoneChasse zoneChasse, Joueur joueur, int nombrefigurine) {
    	System.out.println("Le joueur "+joueur.getCouleur() + " a d�pos� "+nombrefigurine+" dans la zone chasse");
    	if (zoneChasse.getNombrePlaceDisponible()==0){
            System.out.println("Le lieu est complet");
            return;
        }

        joueur.deminuerNombrefigurine(nombrefigurine);
        zoneChasse.deminuerNombrePlace(nombrefigurine);
    }


    /**
    * retirer les figurines
    * @param zone chasse
    * @param joueur le joueur
    */
public void retirerfigurine(ZoneChasse zoneNourriture, Joueur joueur, int nombrefigurine){
	System.out.println("###### retirer figurines "+joueur.getCouleur().name()+" de la zone CHASSE #######");
	joueur.recupererFigurine(nombrefigurine);
   int somDes = lanceurDes.lancerDes(zoneNourriture, nombrefigurine);
   System.out.println("valeur lancement des d�s : " + somDes);
   Ressource nombreNourriture = lanceurDes.recupererNourriture(zoneNourriture, somDes);
   System.out.println("Le joueur "+joueur.getCouleur()+" � gagn� " + nombreNourriture.getNombreRessource()
   + " jouton de nourriture");
   joueur.addNouriture(nombreNourriture.getNombreRessource());

}
/**
* retirer les figurines
* @param zone ressources
* @param joueur le joueur
*/

public void retirerfigurine(ZoneRessource zoneRessource, Joueur joueur, int nombrefigurine){
	System.out.println("###### retirer figurines "+joueur.getCouleur().name()+" de "+zoneRessource.getNom()+" #######");
	joueur.recupererFigurine(nombrefigurine);
	int somDes = lanceurDes.lancerDes(zoneRessource, nombrefigurine);
	System.out.println("valeur lancement des d�s : " + somDes);
	Ressource matierePremiere = lanceurDes.recupererMatierePremiere(zoneRessource, somDes);
	System.out.println("Le joueur "+joueur.getCouleur()+" � gagn� " + matierePremiere.getNombreRessource()
    + " ressource de type "+ matierePremiere.getTypeRessource().name());
	
	joueur.getCompteurMatierePremiere().augmenterRessource(matierePremiere.getTypeRessource(), matierePremiere.getNombreRessource());
	zoneRessource.libererPlace();

}

/**
* retirer les figurines
* @param lieu lieu(Ferme, Hutte, Cabane � outils)
* @param joueur le joueur
*/
public void retirerfigurine(Lieu lieu, Joueur joueur, int nombrefigurine){
	System.out.println("###### retirer figurines "+joueur.getCouleur().name()+" de "+lieu.getNom()+" #######");
	
   //la ferme
   if (lieu instanceof Ferme) {
       //recuperer un niveau d'agriculture
	   joueur.recupererFigurine(lieu.getNbFigurinesPlaces());
       joueur.augmenterNiveauAgriculture();
   }
   //cabane � outils
   if (lieu instanceof CabaneAOutils){
       //recuperer un outil
	   joueur.recupererFigurine(lieu.getNbFigurinesPlaces());
       joueur.addOutil();
   }
   //
   if (lieu instanceof Hutte){
       //recuperer une figurine de plus
	   joueur.recupererFigurine(lieu.getNbFigurinesPlaces());
       joueur.addFigurine();
   }
   lieu.libererPlace();

}

/**
 * nourrir un figurine
 * @param joueur le joueur
 */
public void nourrirfigurine(Joueur joueur){
    System.out.println("######   Nourrir les figurines du joueur"+joueur.getCouleur()+" #######");
    
    joueur.deminuerReserveNouriture();

}

}

