package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		
		// Declaration d'une interface Set implementee par HashSet
		// N'accepte pas les doublons et elements ajoutes de maniere non ordonnee
		Set hs = new HashSet();
		
		//Ajout elements de mani�re non ordonn�e
		hs.add("toto");
		System.out.println(hs.toString());
		hs.add(12);
		System.out.println(hs.toString());
		hs.add("doublon");
		System.out.println(hs.toString());
		hs.add("doublon");
		System.out.println(hs.toString());
		
		//Parcours � l'aide d'un Iterator
		Iterator it = hs.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
