package groupek;

import java.util.List;

public class Joueur {
		private Couleur couleur;
		private int nombreFigurineDisponible;
		private int reserveNouriture ;
		private int niveauAgriculture;
		private int reserveOutil;
		private CompteurMatierePremiere compteurMatierePremiere = new CompteurMatierePremiere();
		private int nbPoint = 0;

		private boolean droitPlacementZoneRessource = true;
		private boolean droitPlacementZoneVillage = true;

		public Joueur(Couleur couleur, int nombrefigurineDisponible, int reserveNouriture, int niveauAgriculture) {
			this.couleur = couleur;
			this.nombreFigurineDisponible = nombrefigurineDisponible;
			this.reserveNouriture = reserveNouriture;
			this.niveauAgriculture = niveauAgriculture;
		}

		public Couleur getCouleur() {
			return couleur;
		}

		public void setCouleur(Couleur couleur) {
			this.couleur = couleur;
		}

		public int getNombreFigurineDisponible() {
			return nombreFigurineDisponible;
		}

		public void setNombreFigurineDisponible(int nombreFigurineDisponible) {
			this.nombreFigurineDisponible = nombreFigurineDisponible;
		}

		public void  addFigurine(){
			this.nombreFigurineDisponible++;
		}

		public void  deminuerNombrefigurine(int nombrefigurinePlace){
			this.nombreFigurineDisponible = this.nombreFigurineDisponible - nombrefigurinePlace;
		}

		public int getReserveNouriture() {
			return reserveNouriture;
		}

		public void setReserveNouriture(int reserveNouriture) {
			this.reserveNouriture = reserveNouriture;
		}

		public void addNouriture(int nombreNouriture) {
			this.reserveNouriture = reserveNouriture + nombreNouriture;
		}

		public int getNiveauAgriculture() {
			return niveauAgriculture;
		}

		public void setNiveauAgriculture(int niveauAgriculture) {
			this.niveauAgriculture = niveauAgriculture;
		}

		public void augmenterNiveauAgriculture(){
			this.niveauAgriculture++;
		}

		public int getReserveOutil() {
			return reserveOutil;
		}

		public void setReserveOutil(int reserveOutil) {
			this.reserveOutil = reserveOutil;
		}

		public void addOutil(){
			this.reserveOutil++;
		}

		public void deminuerReserveNouriture() {
			this.reserveNouriture = this.reserveNouriture - this.getNombreFigurineDisponible();
		}

		public void augmenterReserveNouriture(int nombreNourriture) {
			this.reserveNouriture = this.reserveNouriture + nombreNourriture;
		}

		public int getNbPoint() {
			return nbPoint;
		}

		public void setNbPoint(int nbPoint) {
			this.nbPoint = nbPoint;
		}

		public CompteurMatierePremiere getCompteurMatierePremiere() {
			return compteurMatierePremiere;
		}

		public void setCompteurMatierePremiere(CompteurMatierePremiere compteurMatierePremiere) {
			this.compteurMatierePremiere = compteurMatierePremiere;
		}

		public boolean isDroitPlacementZoneRessource() {
			return droitPlacementZoneRessource;
		}

		public void setDroitPlacementZoneRessource(boolean droitPlacementZoneRessource) {
			this.droitPlacementZoneRessource = droitPlacementZoneRessource;
		}

		public boolean isDroitPlacementZoneVillage() {
			return droitPlacementZoneVillage;
		}

		public void setDroitPlacementZoneVillage(boolean droitPlacementZoneVillage) {
			this.droitPlacementZoneVillage = droitPlacementZoneVillage;
		}

		public void recupererFigurine(int nombreFigurinePlace) {
			this.nombreFigurineDisponible = nombreFigurineDisponible + nombreFigurinePlace;
		}

		public void calculPoint(){
			int nbRessourceBois = this.compteurMatierePremiere.getNbRessourceBois();
			int nbRessourceBrique = this.compteurMatierePremiere.getNbRessourceArgile();
			int nbRessourcePierre = this.compteurMatierePremiere.getNbRessourcePierre();
			int nbRessourceOr = this.compteurMatierePremiere.getNbRessourceOr();

			int nbPointBois = nbRessourceBois * RessourceMatierePremiere.BOIS.getNbPoint();
			int nbPointBrique = nbRessourceBrique * RessourceMatierePremiere.BRIQUE.getNbPoint();
			int nbPointPierre = nbRessourcePierre * RessourceMatierePremiere.PIERRE.getNbPoint();
			int nbPointOr = nbRessourceOr * RessourceMatierePremiere.OR.getNbPoint();

			this.nbPoint = nbPointBois + nbPointBrique + nbPointPierre + nbPointOr;
		}

}