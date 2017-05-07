package metier.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteSimple;

public class CompteSimpleTest {

	@Test
	public void testRetirer1() {
		CompteSimple c = new CompteSimple(1,"CompteSimple1",1000,1000);
		Assert.assertEquals(c.retirer(100), 900,0.1);
	}

	@Test
	public void testRetirer2() {
		CompteSimple c = new CompteSimple(1,"CompteSimple1",1000,1000);
		Assert.assertEquals(c.retirer(-100), 1000,0.1);
	}
	
	@Test
	public void testRetirer3() {
		CompteSimple c = new CompteSimple(1,"CompteSimple1",1000,1000);
		Assert.assertEquals(c.retirer(2000), -1000,0.1);
	}
	
	@Test
	public void testRetirer4() {
		CompteSimple c = new CompteSimple(1,"CompteSimple1",1000,1000);
		Assert.assertEquals(c.retirer(3000), 1000,0.1);
	}

}
