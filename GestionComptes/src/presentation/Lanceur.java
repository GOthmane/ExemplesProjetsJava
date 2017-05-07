package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.CompteSimpleService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//créer un objet service
		//CompteService cs = new CompteService();
		CompteSimpleService cs = new CompteSimpleService();
		
		//créer un objet Compte
		Compte c = new Compte();
		//faire appel aux méthodes
		
		Scanner clavier = new Scanner(System.in);
		int id;
		String nom;
		long solde;
		long montant;
		Boolean test=true;
		while(test)
		{
			// récupération des données saisies par utilisateur
			try {
			System.out.println("Saisir idCompte");
			id=clavier.nextInt();
			System.out.println("Saisir nom du Compte");
			nom=clavier.next();
			System.out.println("Saisir solde");
			solde = clavier.nextLong();
			// affectation des données à l'objet compte
			c.setIdCompte(id);
			c.setNomCompte(nom);
			c.setSolde(solde);
			System.out.println(c);
			
			//saisie montant à ajouter
			System.out.println("Saisir montant à créditer");
			montant = clavier.nextLong();
			cs.ajouter(c, montant);
			// afficher après ajout
			System.out.println(c);
			
			//saisir montant à retirer
			System.out.println("Saisir montant à débiter");
			montant = clavier.nextLong();
			
				cs.retirer(c, montant);
			} catch (SoldeInsuffisantException e) {
				
				System.out.println(e.getMessage());
			} catch (MontantNegatifException e) {
				System.out.println(e.getMessage());
			} catch(InputMismatchException e)
			{
				System.out.println("PROBLEME DE SAISIE");
				test=false;
			}
			
			// afficher après retrait
			 System.out.println(c);
		}
	}

}
