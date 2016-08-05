package groupek;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestFerme {

	Ferme emplacement = new Ferme();
	Figurine f = new Figurine(Couleur.BLEU);


	@Test
	public void getNombrePlaceDisponible()  { 
		assertEquals(1, emplacement.getNombrePlaceDisponible());	

	}
	//@Test
	//public void getName(){
		//assertEquals("Ferme", emplacement.getName());
	//}
}
