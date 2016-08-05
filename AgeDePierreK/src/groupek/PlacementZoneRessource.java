package groupek;

import java.util.Random;

public class PlacementZoneRessource {

    public PhaseJeu phaseJeu = new PhaseJeu();

    public boolean droitRejouer = false;

    private int max = 4;
    private int min = 1;

    private ZoneRessource carriere =new Carriere();
    private ZoneRessource foret = new Foret();
    private ZoneRessource glaisiere = new Glaisiere();
    private ZoneRessource riviere = new Riviere();

    public void placerJoueur(Joueur joueur) {
        while (joueur.isDroitPlacementZoneRessource()) {
            choisirActionPlacement(joueur);
        }
    }

    public void choisirActionPlacement(Joueur joueur){
        int numeroAleatoire = genererNumeroAleatoire();
        switch (numeroAleatoire){
            case 1://FORET
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines du joueur "+joueur.getCouleur()+" pas suffisant");
                }
                if(!foret.isOccupee()){
                	System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé "+joueur.getNombreFigurineDisponible()
                    +" figurine dans "+foret.getNom());
                    phaseJeu.placerfigurine(foret, joueur, joueur.getNombreFigurineDisponible());
                    joueur.setDroitPlacementZoneRessource(false);
                }else {
                    System.out.println("Le lieu "+foret.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneRessource(true);
                }
                break;
            case 2://GLAISIERE
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines pas suffisant");
                    break;
                }
                if(!glaisiere.isOccupee()) {
                	System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé "+joueur.getNombreFigurineDisponible()
                    +" figurine dans "+glaisiere.getNom());
                    phaseJeu.placerfigurine(glaisiere, joueur, joueur.getNombreFigurineDisponible());
                    joueur.setDroitPlacementZoneRessource(false);
                }else {
                    System.out.println("Le lieu "+glaisiere.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneRessource(true);
                }
                break;
            case 3://CARRIERE
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines pas suffisant");
                    break;
                }

                if(!carriere.isOccupee()) {
                	System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé "+joueur.getNombreFigurineDisponible()
                    +" figurine dans "+carriere.getNom());
                    phaseJeu.placerfigurine(carriere, joueur, joueur.getNombreFigurineDisponible());
                    joueur.setDroitPlacementZoneRessource(false);
                }else {
                    System.out.println("Le lieu "+carriere.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneRessource(true);
                }
                break;
            case 4://RIVIERE
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines pas suffisant");
                    break;
                }

                if(!riviere.isOccupee()) {
                	System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé "+joueur.getNombreFigurineDisponible()
                    +" figurine dans "+riviere.getNom());
                    phaseJeu.placerfigurine(riviere, joueur, joueur.getNombreFigurineDisponible());
                    joueur.setDroitPlacementZoneRessource(false);
                }else {
                    System.out.println("Le lieu "+riviere.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneRessource(true);
                }
                break;
        }
    }

    public int genererNumeroAleatoire() {
        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(max - min + 1) + min;

        return nombreAleatoire;
    }

    public boolean isDroitRejouer() {
        return droitRejouer;
    }

    public void setDroitRejouer(boolean droitRejouer) {
        this.droitRejouer = droitRejouer;
    }

    public ZoneRessource getCarriere() {
        return carriere;
    }

    public void setCarriere(ZoneRessource carriere) {
        this.carriere = carriere;
    }

    public ZoneRessource getForet() {
        return foret;
    }

    public void setForet(ZoneRessource foret) {
        this.foret = foret;
    }

    public ZoneRessource getGlaisiere() {
        return glaisiere;
    }

    public void setGlaisiere(ZoneRessource glaisiere) {
        this.glaisiere = glaisiere;
    }

    public ZoneRessource getRiviere() {
        return riviere;
    }

    public void setRiviere(ZoneRessource riviere) {
        this.riviere = riviere;
    }
}


