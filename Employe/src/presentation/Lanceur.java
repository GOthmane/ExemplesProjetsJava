package presentation;

import java.util.Scanner;

import metier.Employe;

public class Lanceur {

	public static void main(String[] args) {
		
		// Creation statique d'un employe
		Employe e0 = new Employe();
		e0.setNom("A");
		e0.setPrenom("Miss");
		e0.setId(0);
		// Pour un nombre de format long plus grand que la capacité max de int, il faut ajouter un l ou L après le nombre
		Employe e1 = new Employe("Mister", "X", 922337203685477580L);
		
		// Affichage de l'employe e1
		System.out.println(e0);
		System.out.println(e1);
		
	    // Creation dynamique d'un employe
		Scanner clavier = new Scanner(System.in);
		// Saisir le nom
		System.out.println("Saisir le nom");
		// Récupérer le nom
		String leNom = clavier.next();
		// Saisir le nom
		System.out.println("Saisir le prénom");
		// Récupérer le nom
		String lePrenom = clavier.next();
		// Saisir l'ID
		System.out.println("Saisir n°ID");
		// Récupérer l'ID
		long lId = clavier.nextLong();
		
		Employe e2 = new Employe(leNom, lePrenom, lId);
		
		// Affichage de l'employe e2
		System.out.println(e2);
		
		clavier.close();
	}

}
