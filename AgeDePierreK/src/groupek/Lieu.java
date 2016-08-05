package groupek;


public abstract class Lieu {

	    private int nombrePlaceDisponible;

	    public abstract boolean isOccupee() ;

	    public abstract void setOccupee(boolean occupee);

	    public abstract String getNom();

	    public abstract int getNombrePlaceDisponible();

	    public abstract Couleur getCouleurFigurinesPlace() ;

	    public abstract int getNbFigurinesPlaces();
	    public abstract void setNbFigurinesPlaces(int nbFigurinesPlaces);

	    public abstract void setCouleurFigurinesPlace(Couleur couleurFigurinesPlace);

	    public void setNombrePlaceDisponible(int nombrePlaceDisponible) {
	        this.nombrePlaceDisponible = nombrePlaceDisponible;
	    }

	    public void deminuerNombreDePlaceDisponible(int nombrefigurinePlace){
	        this.nombrePlaceDisponible = nombrePlaceDisponible - nombrefigurinePlace;
	    }

	    public abstract void libererPlace();
	}
