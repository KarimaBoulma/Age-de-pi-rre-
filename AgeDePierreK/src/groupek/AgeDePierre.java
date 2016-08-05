package groupek;

import java.util.ArrayList;
import java.util.List;

	public class AgeDePierre {

		public static void main(String[] args) {
			System.out.println("#############################################");
			System.out.println("######   Jeu: Age de Pierre Version 4 #######");
			System.out.println("#############################################");

			IA robot = new IA ();
			robot.lancerRobot(2);

			//resultat
			System.out.println("######   Resulat jeu  #######");
	        List<Joueur> listJoueurs = new ArrayList<Joueur>();
	        listJoueurs.add(robot.joueurBleu);
	        listJoueurs.add(robot.joueurRouge);
	        for (Joueur joueur : listJoueurs) {
				System.out.println("Joueur " + joueur.getCouleur().name());
				System.out.println("reserve figurine : " + joueur.getNombreFigurineDisponible());
				System.out.println("Reserve outils : " + joueur.getReserveOutil());
				System.out.println("Niveau d'agriculture : " + joueur.getNiveauAgriculture());
				System.out.println("Reserve nourriture : " + joueur.getReserveNouriture());
				System.out.println("Reserve bois : " + joueur.getCompteurMatierePremiere().getNbRessourceBois());
				System.out.println("Reserve brique : " + joueur.getCompteurMatierePremiere().getNbRessourceArgile());
				System.out.println("Reserve pierre : " + joueur.getCompteurMatierePremiere().getNbRessourcePierre());
				System.out.println("Reserve or : " + joueur.getCompteurMatierePremiere().getNbRessourceOr());
				System.out.println("Nombre de points : " + joueur.getNbPoint());
				System.out.println("#############");
			}

			System.out.println("#############");
	        int nbPointBleu = robot.joueurBleu.getNbPoint();
	        int nbPointRouge = robot.joueurRouge.getNbPoint();
	        if (nbPointBleu > nbPointRouge) {
	            System.out.println("Le gagnant est le joueur "+ robot.joueurBleu.getCouleur());
	        }
	        if(nbPointBleu < nbPointRouge) {
	            System.out.println("Le gagnant est le joueur "+ robot.joueurRouge.getCouleur());
	        }
	        if (nbPointBleu == nbPointRouge){
	            System.out.println("Résultat : égalité");
	        }
			System.out.println("#############");
			System.out.println("#############");

		}
	}
