package groupek;

import static org.junit.Assert.*;

import org.junit.Test;

import groupek.CabaneAOutils;

public class TestCabanneOutils {

	CabaneAOutils emplacement = new CabaneAOutils();
	
	
	
	@Test
	public void  isOccupee() { 
		
		assertEquals(false, emplacement.isOccupee());	

	}

	@Test
	public void getNombrePlaceDisponible()  { 
		assertEquals(1, emplacement.getNombrePlaceDisponible());	

	}
	
	@Test
	public void libererPlace()   { 
		emplacement.setNbFigurinesPlaces(2);
		assertEquals(2, emplacement.getNbFigurinesPlaces());
		emplacement.libererPlace();
		assertEquals(0, emplacement.getNbFigurinesPlaces());

	}	
}
