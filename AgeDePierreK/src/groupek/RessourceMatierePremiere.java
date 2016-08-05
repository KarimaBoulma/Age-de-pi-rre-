package groupek;

public enum RessourceMatierePremiere {

    BOIS(2),
    BRIQUE(3),
    PIERRE(5),
    OR(10);


    int nbPoint;
    RessourceMatierePremiere(int nbPoint) {
        this.nbPoint = nbPoint;
    }

    public int getNbPoint() {
        return nbPoint;
    }
}


