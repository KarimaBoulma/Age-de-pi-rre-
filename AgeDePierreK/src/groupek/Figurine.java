package groupek;

public class Figurine {
	//champs
	Couleur couleur;
	//constructeur
	public Figurine(Couleur r){
		this.couleur=r;
	}
	// getteur
	
	public Couleur getCouleur(){
		return couleur;
	}
	public String toString(){
		return couleur.toString();
	}
}
