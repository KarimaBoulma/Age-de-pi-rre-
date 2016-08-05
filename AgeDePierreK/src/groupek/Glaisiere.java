package groupek;


import groupek.Couleur;
import groupek.RessourceMatierePremiere;

public class Glaisiere extends ZoneRessource{

    public static final int MAX_BRIQUES = 18;

    public static final int DEVISION_DE = 4;

    public static final int MAX_FIGURINE = 7;

    public static final RessourceMatierePremiere TYPE_RESSOURCE = RessourceMatierePremiere.BRIQUE;

    public static int nombrePlaceDisponible;

    private static int nombreRessourceDisponible;

    private Couleur couleurFigurinesPlace;

    private boolean occupee;
    private int nbFigurinesPlaces;

    public Glaisiere() {
        nombreRessourceDisponible = MAX_BRIQUES;
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
        return "Glaisiere";
    }

    @Override
    public void diminuerNombreRessource(int nombreRessource) {
        nombreRessourceDisponible = nombreRessourceDisponible - nombreRessource;
    }

    public static int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public static void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        Glaisiere.nombrePlaceDisponible = nombrePlaceDisponible;
    }

    public static int getNombreRessourceDisponible() {
        return nombreRessourceDisponible;
    }

    public static void setNombreRessourceDisponible(int nombreRessourceDisponible) {
        Glaisiere.nombreRessourceDisponible = nombreRessourceDisponible;
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
