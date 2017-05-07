package presentation;

import metier.Carre;
import metier.Ellipse;
import metier.Rectangle;

public class Lanceur {

	public static void main(String[] args) {
		
		Carre c1 = new Carre(10.0f);
		System.out.println("-----Carre c1-----");
		System.out.println("Perimetre = " + c1.perimetre());
		System.out.println("Surface = " + c1.surface());
		System.out.println("Coefficient d'etalement = " + c1.coefficientEtalement());
		
		Rectangle r1 = new Rectangle(10.0f, 5.0f);
		System.out.println("-----Rectangle r1-----");
		System.out.println("Perimetre = " + r1.perimetre());
		System.out.println("Surface = " + r1.surface());
		System.out.println("Coefficient d'etalement = " + r1.coefficientEtalement());
		
		Ellipse e1 = new Ellipse(10.0f,5.0f);
		System.out.println("-----Ellipse e1-----");
		System.out.println("Perimetre = " + e1.perimetre());
		System.out.println("Surface = " + e1.surface());
		System.out.println("Coefficient d'etalement = " + e1.coefficientEtalement());

	}

}
