package groupek;


import groupek.Lieu;
import groupek.ZoneRessource;

public class IA {
    private PhaseJeu phaseJeu = new PhaseJeu();
    private PlacementVillage placementVillage = new PlacementVillage();
    private PlacementZoneRessource placementZoneRessource = new PlacementZoneRessource();
    private PlacementZoneChasse placementZoneChasse = new PlacementZoneChasse();

    public Joueur joueurBleu = new Joueur(Couleur.BLEU, 5, 12, 0);
    public Joueur joueurRouge = new Joueur(Couleur.ROUGE, 5, 12, 0);

    public void lancerRobot(int nombreTour) {
        for (int i = 0; i < nombreTour; i++) {
        	int numeroTour = i+1;
            System.out.println("##### Tour numero "+ numeroTour+" #####");
            
            placement(joueurBleu);
            placement(joueurRouge);

            recuperationFigurine(joueurBleu);
            recuperationFigurine(joueurRouge);

            nourrirFigurine(joueurBleu);
            nourrirFigurine(joueurRouge);

            //fin du tour
            joueurBleu.setDroitPlacementZoneVillage(true);
            joueurBleu.setDroitPlacementZoneRessource(true);
            
            joueurRouge.setDroitPlacementZoneVillage(true);
            joueurRouge.setDroitPlacementZoneRessource(true);
        }

    }

    public void placement(Joueur joueur) {
    	System.out.println("###Placement joueur "+ joueur.getCouleur()+"####");
        //placer dans la zone village
        placementVillage.placerJoueur(joueur);
        //placer dans la zone chasse
        placementZoneChasse.choisirActionPlacement(joueur);
        //placer dans la zone ressources
        placementZoneRessource.placerJoueur(joueur);
    }

    public void recuperationFigurine(Joueur joueur) {
    	System.out.println("###Retirer figurine joueur "+ joueur.getCouleur()+"####");
        //retirer dans la zone village
        retirerFigurineDuVillage(joueur);
        //retirer dans la zone chasse (toujours 2 jours)
        phaseJeu.retirerfigurine(placementZoneChasse.getZoneChasse(),joueur,2);
        //retirer dans la zone ressources
        retirerFigurineDeZoneRessource(joueur);
    }

    private void retirerFigurineDuVillage(Joueur joueur) {
        Lieu hutte = placementVillage.getHutte();
        Lieu cabaneAOutils = placementVillage.getCabaneAOutils();
        Lieu ferme = placementVillage.getFerme();
        if (hutte.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(hutte, joueur, hutte.getNbFigurinesPlaces());
        }
        if (cabaneAOutils.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(cabaneAOutils, joueur, cabaneAOutils.getNbFigurinesPlaces());
        }
        if (ferme.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(ferme, joueur, ferme.getNbFigurinesPlaces());
        }
    }

    private void retirerFigurineDeZoneRessource(Joueur joueur) {
        ZoneRessource carriere = placementZoneRessource.getCarriere();
        ZoneRessource foret = placementZoneRessource.getForet();
        ZoneRessource glaisiere = placementZoneRessource.getGlaisiere();
        ZoneRessource riviere = placementZoneRessource.getRiviere();
        if (carriere.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(carriere, joueur, carriere.getNbFigurinesPlaces());
        }
        if (glaisiere.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(glaisiere, joueur, glaisiere.getNbFigurinesPlaces());
        }
        if (foret.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(foret, joueur, foret.getNbFigurinesPlaces());
        }
        if (riviere.getCouleurFigurinesPlace() == joueur.getCouleur()) {
            phaseJeu.retirerfigurine(riviere, joueur, riviere.getNbFigurinesPlaces());
        }
    }

    public void nourrirFigurine(Joueur joueur) {
        phaseJeu.nourrirfigurine(joueur);
        joueur.calculPoint();
    }

}