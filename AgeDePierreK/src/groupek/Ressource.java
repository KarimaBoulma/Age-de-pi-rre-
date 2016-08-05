package groupek;


public class Ressource {

    private RessourceMatierePremiere typeRessource;
    private RessourceChasse typeRessourceChasse;

    private int nombreRessource;

    public Ressource(RessourceMatierePremiere typeRessource, int nombreRessource) {
        this.typeRessource = typeRessource;
        this.nombreRessource = nombreRessource;
    }

    public Ressource(RessourceChasse typeRessourceChasse, int nombreRessource) {
        this.typeRessourceChasse = typeRessourceChasse;
        this.nombreRessource = nombreRessource;
    }

    public RessourceMatierePremiere getTypeRessource() {
        return typeRessource;
    }

    public RessourceChasse getTypeRessourceChasse() {
        return typeRessourceChasse;
    }

    public int getNombreRessource() {
        return nombreRessource;
    }
}
