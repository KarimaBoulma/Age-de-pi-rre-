package groupek;

import static org.junit.Assert.*;


import org.junit.Test;

import groupek.Couleur;
import groupek.Figurine;


public class TesteHutte {

	Hutte emplacement = new Hutte();
	Figurine f = new Figurine(Couleur.BLEU);

	@Test
	public void getNombrePlaceDisponible()  { 
		assertEquals(2, emplacement.getNombrePlaceDisponible());	
	}
}
