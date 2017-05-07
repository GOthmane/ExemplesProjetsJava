package presentation;

import metier.Complexe;
import metier.Reel;
import service.ComplexeService;
import service.IComplexeService;
import service.IReelService;
import service.ReelService;

public class Lanceur {

	public static void main(String[] args) {
	
	// Declaration des interfaces
		IReelService rs = new ReelService();
		IComplexeService cs = new ComplexeService();
		
	// Déclaration des complexes
		
		Reel r1 = new Reel(10.5);
		Reel r2 = new Reel(8.6);
		Complexe c1 = new Complexe(5.42,7.58);
		Complexe c2 = new Complexe(8.35,42.67);
		
	// Utilisation des interfaces
		System.out.println("r1 = "+ r1.getX());
		System.out.println("r2 = "+ r2.getX());
		System.out.println("-----Addition r1 + r2-----");
		System.out.println(rs.addition(r1, r2));
		System.out.println("-----Soustraction r1 + r2-----");
		System.out.println(rs.soustraction(r1, r2));
		System.out.println("------------------------------");
		System.out.println("c1 = "+ c1.getRe() +" + i " + c1.getIm());
		System.out.println("c1 = "+ c2.getRe() +" + i " + c2.getIm());
		System.out.println("-----Addition c1 + c2-----");
		System.out.println(cs.addition(c1, c2));
		System.out.println("-----Soustraction c1 + c2-----");
		System.out.println(cs.soustraction(c1, c2));
	}

}
