package groupek;

import groupek.CabaneAOutils;
import groupek.Ferme;
import groupek.Hutte;
import groupek.Chasse;
import groupek.ZoneChasse;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PhaseJeuTest {

    @Test
    public void testPlacerfigurine_Ferme() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        Ferme ferme = new Ferme();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);
        Chasse chasse = new Chasse();
        //WHEN
        phaseJeu.placerfigurine(ferme, joueur, 1);

        //THEN
        
        assertEquals(ferme.isOccupee(),  true);
        assertEquals(ferme.getNombrePlaceDisponible(),1);
        assertEquals(joueur.getNiveauAgriculture(), 0);
        assertEquals(joueur.getNombreFigurineDisponible(), 2);
        assertEquals(joueur.getReserveNouriture(),12);
        assertEquals(joueur.getReserveOutil(), 0);
    }

    @Test
    public void testPlacerfigurine_CabaneAOutils() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        CabaneAOutils cabaneAOutils = new CabaneAOutils();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);
        //WHEN
        phaseJeu.placerfigurine(cabaneAOutils, joueur, 1);

        //THEN
        
        assertEquals(cabaneAOutils.isOccupee(), true);
        assertEquals(cabaneAOutils.getNombrePlaceDisponible(), 1);
        assertEquals(joueur.getNiveauAgriculture(), 0);
        assertEquals(joueur.getNombreFigurineDisponible(), 2);
        assertEquals(joueur.getReserveNouriture(), 12);
        assertEquals(joueur.getReserveOutil(), 0);


    }

    @Test
    public void testPlacerfigurine_Hutte() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        Hutte hutte = new Hutte();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);
        //WHEN
        phaseJeu.placerfigurine(hutte, joueur, 2);

        //THEN
      
        assertEquals(hutte.isOccupee(), true);
        assertEquals(hutte.getNombrePlaceDisponible(), 2);
        assertEquals(joueur.getNiveauAgriculture(), 0);
        assertEquals(joueur.getNombreFigurineDisponible(), 2);
        assertEquals(joueur.getReserveNouriture(), 12);
        assertEquals(joueur.getReserveOutil(), 0);
    }

    @Test
    public void testPlacerfigurine_Chasse() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        ZoneChasse chasse = new Chasse();
        Joueur joueur = new Joueur(Couleur.BLEU, 5, 12, 0);
        //WHEN
        phaseJeu.placerfigurine(chasse, joueur, 2);

        //THEN
        assertEquals(chasse.isOccupee(),true);
        assertEquals(chasse.getNombrePlaceDisponible(),5);
        assertEquals(joueur.getNiveauAgriculture(),0);
        assertEquals(joueur.getNombreFigurineDisponible(),3);
        assertEquals(joueur.getReserveNouriture(),12);
        assertEquals(joueur.getReserveOutil(), 0);
        assertEquals(joueur.getNombreFigurineDisponible(),3);
    }

    @Test
    public void testRetirerfigurine_Ferme() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        Ferme ferme = new Ferme();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);

        //WHEN
        phaseJeu.retirerfigurine(ferme, joueur,1);

        //THEN
        
        assertEquals(ferme.isOccupee(), false);
        assertEquals(ferme.getNombrePlaceDisponible(), 1);
        assertEquals(joueur.getNiveauAgriculture(), 1);
        assertEquals(joueur.getNombreFigurineDisponible(), 2);
        assertEquals(joueur.getReserveNouriture(), 12);
        assertEquals(joueur.getReserveOutil(), 0);
    }

    @Test
    public void testRetirerfigurine_CabaneAOutils() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        CabaneAOutils cabaneAOutils = new CabaneAOutils();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);

        //WHEN
        phaseJeu.retirerfigurine(cabaneAOutils, joueur,1);

        //THEN        
        assertEquals(cabaneAOutils.isOccupee(), false);
        assertEquals(cabaneAOutils.getNombrePlaceDisponible(), 1);
        assertEquals(joueur.getNiveauAgriculture(), 0);
        assertEquals(joueur.getNombreFigurineDisponible(), 2);
        assertEquals(joueur.getReserveNouriture(), 12);
        assertEquals(joueur.getReserveOutil(), 1);
    }

    @Test
    public void testRetirerfigurine_Hutte() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        Hutte hutte = new Hutte();
        Joueur joueur = new Joueur(Couleur.BLEU, 2, 12, 0);

        //WHEN
        phaseJeu.retirerfigurine(hutte, joueur,2);

        //THEN
    	assertEquals(hutte.isOccupee(), false);
		assertEquals(hutte.getNombrePlaceDisponible(), 2);
		assertEquals(joueur.getNiveauAgriculture(), 0);
		//assertEquals(joueur.getNombreFigurineDisponible(), 3);
		assertEquals(joueur.getReserveNouriture(), 12);
		assertEquals(joueur.getReserveOutil(), 0);
    }

    @Test
    public void testNourrirfigurine() throws Exception {
        //GIVEN
        PhaseJeu phaseJeu = new PhaseJeu();
        Joueur joueur = new Joueur(Couleur.BLEU, 5, 12,0);

        //WHEN
        phaseJeu.nourrirfigurine(joueur);
        //THEN
     
    	assertEquals(joueur.getNiveauAgriculture(), 0);
		assertEquals(joueur.getNombreFigurineDisponible(), 5);
		assertEquals(joueur.getReserveNouriture(), 7);
		assertEquals(joueur.getReserveOutil(), 0);
    }
}