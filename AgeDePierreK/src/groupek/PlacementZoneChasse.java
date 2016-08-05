package groupek;


import groupek.Chasse;
import groupek.ZoneChasse;

public class PlacementZoneChasse {

    public PhaseJeu phaseJeu = new PhaseJeu();

    private ZoneChasse zoneChasse = new Chasse();

    public void choisirActionPlacement(Joueur joueur){
        phaseJeu.placerfigurine(zoneChasse, joueur, 2);
    }

    public ZoneChasse getZoneChasse() {
        return zoneChasse;
    }

    public void setZoneChasse(ZoneChasse zoneChasse) {
        this.zoneChasse = zoneChasse;
    }
}
