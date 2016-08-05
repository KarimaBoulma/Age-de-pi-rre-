package groupek;

import static org.junit.Assert.*;

import org.junit.Test;

public class RessourceMatierePremiereTest {

 @Test
 public void test_RessourceMatierePremiere(){
	 assertEquals(RessourceMatierePremiere.BOIS.getNbPoint(), 2);
	 assertEquals(RessourceMatierePremiere.BRIQUE.getNbPoint(), 3);
	 assertEquals(RessourceMatierePremiere.PIERRE.getNbPoint(), 5);
	 assertEquals(RessourceMatierePremiere.OR.getNbPoint(), 10);
	 
		    }

}


