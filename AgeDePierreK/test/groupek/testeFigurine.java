package groupek;

import static org.junit.Assert.*;

import org.junit.Test;

public class testeFigurine {

		Figurine fig = new Figurine(Couleur.ROUGE);
		

		@Test 	
		// test du getteur de couleur
		public void testGetCouleur(){
			assertEquals(fig.getCouleur(),Couleur.ROUGE); 
		}

}
