package metier.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import metier.Compte;

public class CompteTest {

	@Test
	public void testVerser1() {
		Compte c = new Compte(1,"Compte1",1000);
		Assert.assertEquals(c.verser(100), 1100,0.1);
	}
	
	@Test
	public void testVerser2() {
		Compte c = new Compte(1,"Compte1",1000);
		Assert.assertEquals(c.verser(-100), 1000,0.1);
	}
	
	@Test
	public void testRetirer1() {
		Compte c = new Compte(1,"Compte1",1000);
		Assert.assertEquals(c.retirer(100), 900,0.1);
	}

	@Test
	public void testRetirer2() {
		Compte c = new Compte(1,"Compte1",1000);
		Assert.assertEquals(c.retirer(-100), 1000,0.1);
	}
	
	@Test
	public void testRetirer3() {
		Compte c = new Compte(1,"Compte1",1000);
		Assert.assertEquals(c.retirer(1001), 1000,0.1);
	}
	
}
