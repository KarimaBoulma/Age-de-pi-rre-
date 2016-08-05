package groupek;

import static org.junit.Assert.*;


import org.junit.Test;

import groupek.Couleur;
import groupek.Figurine;

public class TestLieu {


	Hutte emplacement = new Hutte();
	Figurine f = new Figurine(Couleur.BLEU);
	
	@Test
	public void setOccupee(){
		assertEquals(false, emplacement.isOccupee());
		emplacement.setOccupee(true);
		assertEquals(true, emplacement.isOccupee());
	}
	
	@Test
	public void deminuerNombreDePlaceDisponible(){
		assertEquals(2,emplacement.getNombrePlaceDisponible());
		emplacement.deminuerNombreDePlaceDisponible(1);
		assertEquals(2,emplacement.getNombrePlaceDisponible());
	}
	
	@Test
	public void libererPlace(){
		assertEquals(2,emplacement.getNombrePlaceDisponible());
		emplacement.libererPlace();
		assertEquals(2,emplacement.getNombrePlaceDisponible());
	     
	    }
}
 