package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		
		// 1- Declaration d'une interface SortedSet implementee par TreeSet
		// N'accepte pas les doublons et elements ajoutes de maniere ordonnee
		// Fonction de tri = fonction interne
		// TRI PAR ORDRE ALPHABETIQUE
		SortedSet<Personne> set = new TreeSet<Personne>( 
				
				new Comparator<Personne>() {

					@Override
					public int compare(Personne o1, Personne o2) {
					
					if (o1.getNom().equals(o2.getNom()))
					{
					return o1.getPrenom().compareTo(o2.getPrenom());
					}
					
					else
					{
					return o1.getNom().compareTo(o2.getNom());
					}
		}});
		
		// TRI PAR ORDRE ALPHABETIQUE INVERSE
				SortedSet<Personne> set2 = new TreeSet<Personne>( 
						
						new Comparator<Personne>() {

							@Override
							public int compare(Personne o1, Personne o2) {
							
							if (o1.getNom().equals(o2.getNom()))
							{
							return -o1.getPrenom().compareTo(o2.getPrenom());
							}
							
							else
							{
							return -o1.getNom().compareTo(o2.getNom());
							}
				}});
				
				// TRI PAR ORDRE ALPHABETIQUE
				SortedSet<Personne> set3 = new TreeSet<Personne>( 
						
						new Comparator<Personne>() {

							@Override
							public int compare(Personne o1, Personne o2) {
							
								return ((Integer)o1.getId()).compareTo(((Integer)o2.getId()));
				}});
		
		// 2- Creation des objets personnes
		Personne m1 = new Personne(1,"Nom1","Prenom1");
		Personne m2 = new Personne(2,"Nom1","Prenom2");
		Personne m3 = new Personne(3,"Nom3","Prenom3"); 
		Personne m4 = new Personne(4,"Nom4","Prenom4");
		
		// 3- Ajout des personnes a la collection
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set2.add(m1);
		set2.add(m2);
		set2.add(m3);
		set2.add(m4);
		set3.add(m1);
		set3.add(m2);
		set3.add(m3);
		set3.add(m4);
		
		// 4- Parcourir et afficher la collection
		
		System.out.println("-----------TRI PAR ORDRE ALPHABETIQUE------------");
		
		for (Personne p : set)
		{
			System.out.println(p);
		}
		
		System.out.println("--- ---TRI PAR ORDRE ALPHABETIQUE INVERSE--- ---");
		
		for (Personne p : set2)
		{
			System.out.println(p);
		}
		
		System.out.println("--------------TRI PAR ORDRE D'ID---------------");
		
		for (Personne p : set3)
		{
			System.out.println(p);
		}

	}

}
