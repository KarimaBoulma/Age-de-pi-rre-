package groupek;

public class Ferme extends Lieu {
    public static final int MAX_FIGURINE = 1;

    public static boolean occupe;

    public int nombrePlaceDisponible = 1;

    private Couleur couleurFigurinesPlace;

    private int nbFigurinesPlaces;

    public Ferme() {
        this.nombrePlaceDisponible = MAX_FIGURINE;
    }


    public boolean isOccupee() {
        return occupe;
    }

    public void setOccupee(boolean occupee) {
        Ferme.occupe = occupee;
    }

    public String getNom() {
        return "Ferme";
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

