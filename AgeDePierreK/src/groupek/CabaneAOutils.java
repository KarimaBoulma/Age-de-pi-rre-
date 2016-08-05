package groupek;


import groupek.Couleur;

public class CabaneAOutils extends Lieu {
    public static int MAX_FIGURINE = 1;

    public boolean occupe;

    public int nombrePlaceDisponible;

    private Couleur couleurFigurinesPlace;

    private int nbFigurinesPlaces;

    public CabaneAOutils() {
        this.nombrePlaceDisponible = MAX_FIGURINE;
    }

    public boolean isOccupee() {
        return this.occupe;
    }

    public void setOccupee(boolean occupee) {
        this.occupe = occupee;
    }

    public String getNom() {
        return "CabaneAOutils";
    }

    @Override
    public int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public Couleur getCouleurFigurinesPlace() {
        return couleurFigurinesPlace;
    }

    public int getNbFigurinesPlaces() {
        return nbFigurinesPlaces;
    }

    public void setNbFigurinesPlaces(int nbFigurinesPlaces) {
        this.nbFigurinesPlaces = nbFigurinesPlaces;
    }

    public void setCouleurFigurinesPlace(Couleur couleurFigurinesPlace) {
        this.couleurFigurinesPlace = couleurFigurinesPlace;
    }

    public void libererPlace() {
        this.occupe = false;
        this.nbFigurinesPlaces = 0;
        this.couleurFigurinesPlace = null;
    }
}
