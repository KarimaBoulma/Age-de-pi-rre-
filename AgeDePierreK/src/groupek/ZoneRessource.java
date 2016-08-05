package groupek;

public abstract class ZoneRessource {

	    private Couleur couleurFigurinesPlace;

	    public abstract int getDevisionDes();

	    public abstract RessourceMatierePremiere getTypeRessource();

	    public abstract String getNom();

	    public abstract void diminuerNombreRessource(int nombreRessource);

	    public abstract Couleur getCouleurFigurinesPlace() ;

	    public abstract void setCouleurFigurinesPlace(Couleur couleurFigurinesPlace);

	    public abstract int getNbFigurinesPlaces();
	    public abstract void setNbFigurinesPlaces(int nbFigurinesPlaces);

	    public abstract boolean isOccupee();

	    public abstract void setOccupee(boolean occupee);

	    public abstract void libererPlace();
	}

