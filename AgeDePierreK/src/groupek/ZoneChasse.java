package groupek;


import groupek.RessourceChasse;

public abstract class ZoneChasse {

    private static boolean occupee = false;

    private int nombrePlaceDisponible = 7;

    public abstract int getDevisionDes();
    public abstract RessourceChasse getTypeRessource();

    public static boolean isOccupee() {
        return occupee;
    }

    public static void setOccupee(boolean occupee) {
        ZoneChasse.occupee = occupee;
    }

    public abstract void deminuerNombrePlace(int nombrefigurine);

    public int getNombrePlaceDisponible() {
        return nombrePlaceDisponible;
    }

    public void setNombrePlaceDisponible(int nombrePlaceDisponible) {
        this.nombrePlaceDisponible = nombrePlaceDisponible;
    }
}
