package groupek;


import groupek.Couleur;

public class Hutte extends Lieu {

    private int nombrePlaceDisponible;

    public static boolean occupe;

    public static final int MAX_FIGURINES = 2;

    private Couleur couleurFigurinesPlace;

    private int nbFigurinesPlaces;

    public Hutte() {
        this.nombrePlaceDisponible = MAX_FIGURINES;
    }


    public boolean isOccupee() {
        return occupe;
    }

    public void setOccupee(boolean occupee) {
        Hutte.occupe = occupee;
    }

    public String getNom() {
        return "Hutte";
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
