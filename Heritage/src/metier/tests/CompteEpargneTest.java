package metier.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteEpargne;

public class CompteEpargneTest {

	@Test
	public void testCalculInterets() {
		CompteEpargne c = new CompteEpargne(1,"CompteEpargne1",1000,0.001f);
		Assert.assertEquals(c.calculInterets(), 1,0.1);
	}

}
