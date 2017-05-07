package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		
		//Compte c = new Compte(1, "testCompte", 1000);
		CompteSimple cs = new CompteSimple(2, "testCompteSimple", 1000, 1000);
		CompteEpargne ce = new CompteEpargne(3, "testCompteEpargne", 1000, (float)0.5);
		ComptePayant cp = new ComptePayant(4, "testComptePayant", 1000, 0.2f);
		
		
		//System.out.println(c);
		System.out.println(cs);
		System.out.println(ce);
		System.out.println(cp);
		
		/*c.verser(100);
		System.out.println(c);
		c.retirer(500);
		System.out.println(c);
		c.retirer(2000);
		System.out.println(c);*/
		cs.retirer(2000);
		System.out.println(cs);
		System.out.println(ce.calculInterets());
		cp.verser(100);
		System.out.println(cp);
		cp.retirer(100);
		System.out.println(cp);
		System.out.println("-----------------Nombre de comptes---------------------");
		System.out.println(Compte.getNbComptes());

		/*//transtypage CompteSimple => Compte OK, mais les méthodes de cs2 restent
		 * celles de CompteSimple car la spécialisation domine
		Compte cs2 = (Compte) new CompteSimple(2, "compte2", 12000, 1000);
		//transtypage Compte => CompteSimple IMPOSSIBLE
		CompteSimple cs3 = (CompteSimple) new Compte(3, "compte3", 12000);
		System.out.println(cs2.getClass());
		System.out.println(cs3.getClass());
		*/
		
	}

}
