package presentation;

import metier.ClasseGenerique;

public class Lanceur {

	public static void main(String[] args) {
		
		ClasseGenerique<String, Double, Float> Objet1 = new ClasseGenerique<String, Double, Float>("Salut", 1.500, 1.500f);
		ClasseGenerique<Float, String, Float> Objet2 = new ClasseGenerique<Float, String, Float>(1.500f, "Salut", 1.500f);
		ClasseGenerique<String, String, Integer> Objet3 = new ClasseGenerique<String, String, Integer>("Salut", "Ca va?", 1);

		System.out.println(Objet1);
		System.out.println(Objet2);
		System.out.println(Objet3);
	}

}
