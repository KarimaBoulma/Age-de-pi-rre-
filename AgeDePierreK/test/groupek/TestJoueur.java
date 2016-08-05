	package groupek;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJoueur {
	Joueur j = new Joueur(Couleur.BLEU, 2, 0, 0);
	Figurine f = new Figurine(Couleur.BLEU);
	
	@Test
	public void getCouleur(){
		assertEquals(Couleur.BLEU, j.getCouleur());
		
	}
	@Test
	public void setCouleur(){
		j.setCouleur(Couleur.ROUGE);
		assertEquals(Couleur.ROUGE, j.getCouleur());	
	}
	
	@Test
	public void getNombreFigurinesDisponibles(){
		assertEquals(2, j.getNombreFigurineDisponible());
		
	}
	
	@Test
	public void setNombreFigurinesDisponibles(){
		j.setNombreFigurineDisponible(1);
		assertEquals(1, j.getNombreFigurineDisponible());			
	}

	@Test
	public void  addFigurine(){
		assertEquals(2, j.getNombreFigurineDisponible());
		j.addFigurine();
		assertEquals(3, j.getNombreFigurineDisponible());		
	}
	
	@Test
	public void getReserveNouriture(){
		assertEquals(0, j.getReserveNouriture());
	}
	
	@Test
	public void setReserveNouriture(){
		assertEquals(0, j.getReserveNouriture());
		j.setReserveNouriture(1);
		assertEquals(1, j.getReserveNouriture());
	}
	
	@Test
	public void getNiveauAgriculture(){
		assertEquals(0, j.getNiveauAgriculture());
		
	}
	@Test
	public void setNiveauAgriculture(){
		assertEquals(0, j.getNiveauAgriculture());
		j.setNiveauAgriculture(1);
		assertEquals(1, j.getNiveauAgriculture());
		
	}
	
	@Test
	public void augmenterNiveauAgriculture(){
		assertEquals(0, j.getNiveauAgriculture());
		j.augmenterNiveauAgriculture();
		assertEquals(1, j.getNiveauAgriculture());
		
	}
	
	@Test
	public void getReserveOutil(){
		assertEquals(0,j.getReserveOutil());
	}
	
	@Test
	public void setReserveOutil(){
		assertEquals(0,j.getReserveOutil());
		j.setReserveOutil(1);
		assertEquals(1,j.getReserveOutil());
	}
	
	@Test
	public void addOutil(){
		assertEquals(0,j.getReserveOutil());
		j.addOutil();
		assertEquals(1,j.getReserveOutil());
	}

	@Test
	public void deminuerReserveNouriture(){
		assertEquals(0,j.getReserveNouriture());
		j.setReserveNouriture(3);
		j.setNombreFigurineDisponible(1); 
		j.deminuerReserveNouriture();
		assertEquals(2,j.getReserveNouriture());
	}
}
