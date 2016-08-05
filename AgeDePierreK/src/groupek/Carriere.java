package groupek;

public class Carriere extends ZoneRessource {

    public static final int MAX_PIERRE =12;

    public static final int DEVISION_DE = 5;

    public static final int MAX_FIGURINE = 7;

    public static final RessourceMatierePremiere TYPE_RESSOURCE = RessourceMatierePremiere.PIERRE;

    public static int nombrePlaceDisponible;

    public static int nombreRessourceDisponible;

    private boolean occupee = false;

    private Couleur couleurFigurinesPlace;
    private int nbFigurinesPlaces;


    public Carriere() {

        this.nombreRessourceDisponible = MAX_PIERRE;
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
        return "Carriere";
    }

    @Override
    public void diminuerNombreRessource(int nombreRessource) {
        nombreRessourceDisponible = nombreRessourceDisponible - nombreRessource;
    }


    public static int getNombreRessourceDisponible() {
        return nombreRessourceDisponible;
    }

    public static void setNombreRessourceDisponible(int nombreRessourceDisponible) {
        Carriere.nombreRessourceDisponible = nombreRessourceDisponible;
    }

    public static int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public static void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        Carriere.nombrePlaceDisponible = nombrePlaceDisponible;
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
