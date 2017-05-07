package Presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {
		
		// Declaration d'une interface List implementee par ArrayList
		// Accepte les doublons et ajout des elements de maniere ordonnee
		List al = new ArrayList();
		
		//Ajout elements
		al.add(12);
		System.out.println(al.toString());
		al.add("Bonjour");
		System.out.println(al.toString());
		al.add(12.1f);
		System.out.println(al.toString());
		al.add(true);
		System.out.println(al.toString());
		al.add("doublon");
		System.out.println(al.toString());
		al.add("doublon");
		System.out.println(al.toString());
		
		//Parcours
		for (int i=0; i<al.size(); i++) {
			System.out.println("donnée à l'indice " + i + " = " + al.get(i));
		}
		
		/* Pour faire une liste ne pouvant contenir
		que des données de type String
		List<String> al = new ArrayList<String>();
		*/

	}

}
