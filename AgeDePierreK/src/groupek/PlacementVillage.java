package groupek;

import groupek.CabaneAOutils;
import groupek.Ferme;
import groupek.Hutte;
import groupek.Lieu;

import java.util.Random;

public class PlacementVillage {

    public PhaseJeu phaseJeu = new PhaseJeu();
    public boolean droitRejouer = false;

    private int max = 3;
    private int min = 1;

    private Lieu ferme =new Ferme();
    private Lieu hutte = new Hutte();
    private Lieu cabaneAOutils = new CabaneAOutils();

    public void placerJoueur(Joueur joueur) {
        while (joueur.isDroitPlacementZoneVillage()) {
            choisirActionPlacement(joueur);
        }
    }

    public void choisirActionPlacement(Joueur joueur){
        int numeroAleatoire = genererNumeroAleatoire();
        switch (numeroAleatoire){
            case 1://FERME
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines du joueur "+joueur.getCouleur()+" pas suffisant");
                }
                if(!ferme.isOccupee()){
                    phaseJeu.placerfigurine(ferme, joueur, 1);
                    joueur.setDroitPlacementZoneVillage(false);
                    System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé une figurine dans "+ferme.getNom());
                }else {
                    System.out.println("Le lieu "+ferme.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneVillage(true);
                    setDroitRejouer(true);
                }
                break;
            case 2://HUTTE
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines pas suffisant");
                    break;
                }
                if(!hutte.isOccupee()) {
                    phaseJeu.placerfigurine(hutte, joueur, 2);
                    joueur.setDroitPlacementZoneVillage(false);
                    System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé 2 figurines dans "+hutte.getNom());
                }else {
                    System.out.println("Le lieu "+hutte.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneVillage(true);
                    setDroitRejouer(true);
                }
                break;
            case 3://CANAE A OUTILS
                if(joueur.getNombreFigurineDisponible() <= 0){
                    System.out.println("Nombre de figurines pas suffisant");
                    break;
                }

                if(!cabaneAOutils.isOccupee()) {
                    phaseJeu.placerfigurine(cabaneAOutils, joueur, 1);
                    joueur.setDroitPlacementZoneVillage(false);
                    System.out.println("Le joueur "+joueur.getCouleur()+ " a déposé une figurine dans "+cabaneAOutils.getNom());
                }else {
                    System.out.println("Le lieu "+cabaneAOutils.getNom()+" est occupé. choissisez un autre lieu");
                    joueur.setDroitPlacementZoneVillage(true);
                    setDroitRejouer(true);
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

    public PhaseJeu getPhaseJeu() {
        return phaseJeu;
    }

    public void setPhaseJeu(PhaseJeu phaseJeu) {
        this.phaseJeu = phaseJeu;
    }

    public Lieu getHutte() {
        return hutte;
    }

    public void setHutte(Lieu hutte) {
        this.hutte = hutte;
    }

    public Lieu getCabaneAOutils() {
        return cabaneAOutils;
    }

    public void setCabaneAOutils(Lieu cabaneAOutils) {
        this.cabaneAOutils = cabaneAOutils;
    }

    public Lieu getFerme() {
        return ferme;
    }

    public void setFerme(Lieu ferme) {
        this.ferme = ferme;
    }
}


