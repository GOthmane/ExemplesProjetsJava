package metier.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import metier.ComptePayant;

public class ComptePayantTest {

	@Test
	public void testVerser() {
		ComptePayant c = new ComptePayant(1,"Compte1",1000,1);
		Assert.assertEquals(c.verser(100), 1099,0.1);
	}

	@Test
	public void testRetirer1() {
		ComptePayant c = new ComptePayant(1,"Compte1",1000,1);
		Assert.assertEquals(c.retirer(100), 899,0.1);
	}
	
	@Test
	public void testRetirer2() {
		ComptePayant c = new ComptePayant(1,"Compte1",1000,1);
		Assert.assertEquals(c.retirer(2000), 1000,0.1);
	}

}
