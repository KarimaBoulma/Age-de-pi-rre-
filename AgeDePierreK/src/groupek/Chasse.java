package groupek;

import groupek.Couleur;
import groupek.RessourceChasse;

public class Chasse extends ZoneChasse {

    private static int DEVISION_DE = 2;

    private static final RessourceChasse TYPE_RESSOURCE = RessourceChasse.NOURRITURE;

    private static int nombrePlaceDisponible = 7;

    private static boolean occupee;

    private Couleur couleurFigurinesPlace;

    public Chasse() {
    }

    @Override
    public int getDevisionDes() {
        return this.DEVISION_DE;
    }

    @Override
    public RessourceChasse getTypeRessource() {
        return this.TYPE_RESSOURCE;
    }

    public Chasse(boolean occupee) {
        this.occupee = occupee;
    }

    public static boolean isOccupee() {
        return occupee;
    }

    public static void setOccupee(boolean occupee) {
        Chasse.occupee = occupee;
    }

    public void deminuerNombrePlace(int nombreFigurine) {
        nombrePlaceDisponible = nombrePlaceDisponible - nombreFigurine;
    }

    public int getNombrePlaceDisponible() {
        return Chasse.nombrePlaceDisponible;
    }

    public void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        Chasse.nombrePlaceDisponible = nombrePlaceDisponible;
    }

    public void deminuerNombrePlaceDisponible(int nombreFigurine) {
        nombrePlaceDisponible = nombrePlaceDisponible - nombreFigurine;
    }

    public Couleur getCouleurFigurinesPlace() {
        return couleurFigurinesPlace;
    }

    public void setCouleurFigurinesPlace(Couleur couleurFigurinesPlace) {
        this.couleurFigurinesPlace = couleurFigurinesPlace;
    }
}
