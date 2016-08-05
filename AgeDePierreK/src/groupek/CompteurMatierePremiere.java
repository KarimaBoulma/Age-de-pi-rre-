package groupek;

public class CompteurMatierePremiere {
	    private int nbRessourceBois = 0;
	    private int nbRessourceArgile = 0;
	    private int nbRessourcePierre = 0;
	    private int nbRessourceOr = 0;

	    public void augmenterRessource(RessourceMatierePremiere ressourceMatierePremiere, int nombre) {
	        switch (ressourceMatierePremiere) {
	            case BOIS:
	                this.nbRessourceBois=+nombre;
	                break;
	            case BRIQUE:
	                this.nbRessourceArgile=+nombre;
	                break;
	            case PIERRE:
	                this.nbRessourcePierre=+nombre;
	                break;
	            case OR:
	                this.nbRessourceOr=+nombre;
	                break;
	        }
	    }

	    public int getNbRessourceBois() {
	        return nbRessourceBois;
	    }

	    public void setNbRessourceBois(int nbRessourceBois) {
	        this.nbRessourceBois = nbRessourceBois;
	    }

	    public int getNbRessourceArgile() {
	        return nbRessourceArgile;
	    }

	    public void setNbRessourceArgile(int nbRessourceArgile) {
	        this.nbRessourceArgile = nbRessourceArgile;
	    }

	    public int getNbRessourcePierre() {
	        return nbRessourcePierre;
	    }

	    public void setNbRessourcePierre(int nbRessourcePierre) {
	        this.nbRessourcePierre = nbRessourcePierre;
	    }

	    public int getNbRessourceOr() {
	        return nbRessourceOr;
	    }

	    public void setNbRessourceOr(int nbRessourceOr) {
	        this.nbRessourceOr = nbRessourceOr;
	    }
	}

