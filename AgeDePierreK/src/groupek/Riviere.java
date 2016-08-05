package groupek;


import groupek.Couleur;
import groupek.RessourceMatierePremiere;

public class Riviere extends ZoneRessource{

    public static final int MAX_OR =10;

    public static final int DEVISION_DE = 6;

    public static final int MAX_FIGURINE = 7;

    public static final RessourceMatierePremiere TYPE_RESSOURCE = RessourceMatierePremiere.OR;

    public static int nombrePlaceDisponible;

    private static int nombreRessourceDisponible;

    private Couleur couleurFigurinesPlace;

    private boolean occupee = false;
    private int nbFigurinesPlaces = 0;

    public Riviere() {
        nombreRessourceDisponible = MAX_OR;
    }

    @Override
    public int getDevisionDes() {
        return DEVISION_DE;
    }

    @Override
    public RessourceMatierePremiere getTypeRessource() {
        return this.TYPE_RESSOURCE;
    }

    public String getNom() {
        return "Riviere";
    }

    @Override
    public void diminuerNombreRessource(int nombreRessource) {
        nombreRessourceDisponible = nombreRessourceDisponible - nombreRessource;
    }

    public static int getNombreRessourceDisponible() {
        return nombreRessourceDisponible;
    }

    public static int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public static void setNombreRessourceDisponible(int nombreRessourceDisponible) {
        Riviere.nombreRessourceDisponible = nombreRessourceDisponible;
    }

    public static void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        Riviere.nombrePlaceDisponible = nombrePlaceDisponible;
    }

    public Couleur getCouleurFigurinesPlace() {
        return couleurFigurinesPlace;
    }

    public void setCouleurFigurinesPlace(Couleur couleurFigurinesPlace) {
        this.couleurFigurinesPlace = couleurFigurinesPlace;
    }

    public int getNbFigurinesPlaces() {
        return nbFigurinesPlaces;
    }

    public void setNbFigurinesPlaces(int nbFigurinesPlaces) {
        this.nbFigurinesPlaces = nbFigurinesPlaces;
    }

    public boolean isOccupee() {
        return this.occupee;
    }

    public void setOccupee(boolean occupee) {
        this.occupee = occupee;
    }

    public void libererPlace() {
        this.occupee = false;
        this.nbFigurinesPlaces = 0;
        this.couleurFigurinesPlace = null;
    }
}
