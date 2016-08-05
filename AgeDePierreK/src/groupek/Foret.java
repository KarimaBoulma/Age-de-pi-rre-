package groupek;

public class Foret extends ZoneRessource{
	

	    public static final int MAX_BOIS = 28;

	    public static final int DEVISION_DE = 3;

	    public static final int MAX_FIGURINE = 7;

	    public static final RessourceMatierePremiere TYPE_RESSOURCE = RessourceMatierePremiere.BOIS;

	    public static int nombrePlaceDisponible;

	    private static int nombreRessourceDisponible;

	    private boolean occupee;
	    private int nbFigurinesPlaces;

	    private Couleur couleurFigurinesPlace;


	    public Foret() {
	        nombreRessourceDisponible = MAX_BOIS;
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
	        return "Foret";
	    }


	    @Override
	    public void diminuerNombreRessource(int nombreRessource) {
	        nombreRessourceDisponible = nombreRessourceDisponible - nombreRessource;
	    }

	    public static int getNombreRessourceDisponible() {
	        return nombreRessourceDisponible;
	    }

	    public static void setNombreRessourceDisponible(int nombreRessourceDisponible) {
	        Foret.nombreRessourceDisponible = nombreRessourceDisponible;
	    }

	    public static int getNombrePlaceDisponible() {
	        return nombrePlaceDisponible;
	    }

	    public static void setNombrePlaceDisponible(int nombrePlaceDisponible) {
	        Foret.nombrePlaceDisponible = nombrePlaceDisponible;
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