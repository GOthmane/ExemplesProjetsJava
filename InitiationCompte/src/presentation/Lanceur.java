package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

/**
 * Classe de démarrage de l'application
 * @author Stagiaire
 * @version 1.0
 */
public class Lanceur {

	/**
	 * La méthode main est chargée en mémoire au démarrage de l'application
	 * et peut donc être utilisée avant la création de tout objet
	 * @param args arguments de la méthode main
	 */
	public static void main(String[] args) {
		
		// Instanciation d'un objet de la classe CompteService
		CompteService cs = new CompteService();
		
		// Création d'un objet Compte
		Compte c = new Compte();
		
		// Appel aux méthodes
		
		Scanner clavier = new Scanner(System.in);
		int id;
		String nom;
		long solde;
		long montant;
		int choice=0;
		boolean test = true;
		
		while(choice!=4 & test==true)
		{
			try{
			System.out.println("Taper 1, 2, 3 ou 4");
			choice = clavier.nextInt();
			switch (choice)
			{
			case 1 :
			{
				// Récupération des données saisies par l'utilisateur
				System.out.println("Saisir idCompte");
				id=clavier.nextInt();
				clavier.nextLine();
				System.out.println("Saisir nom du compte");
				nom=clavier.nextLine();
				System.out.println("Saisir solde");
				solde=clavier.nextLong();
				//Affectation de données à l'objet compte
				c.setIdCompte(id);
				c.setNomCompte(nom);
				c.setSolde(solde);
				System.out.println(c);
				break;
			}
			case 2 :
			{
				//Saisir montant à ajouter
				System.out.println("Saisir montant à ajouter");
				montant = clavier.nextLong();
				cs.ajouter(c, montant);
				//Afficher après ajout
				System.out.println(c);
				break;
			} 
			case 3 :
			{
				//Saisir montant à retirer
				System.out.println("Saisir montant à retirer");
				montant = clavier.nextLong();
				cs.retirer(c, montant);
				//Afficher après retrait
				System.out.println(c);
				break;
			}
			//default : System.out.println("RECOMMENCER SAISIE");
			} } catch (MontantNegatifException e) {
				System.out.println(e.getMessage());
			  } catch (SoldeInsuffisantException e) {
				System.out.println(e.getMessage());
			  } catch (InputMismatchException e) {
				System.out.println("PROBLEME DE SAISIE");
				test=false;
			  }
				
			
			/*Récupération des données saisies par l'utilisateur
			System.out.println("Saisir idCompte");
			id=clavier.nextInt();
			clavier.nextLine();
			System.out.println("Saisir nom du compte");
			nom=clavier.nextLine();
			System.out.println("Saisir solde");
			solde=clavier.nextLong();
			//Affectation de données à l'objet compte
			c.setIdCompte(id);
			c.setNomCompte(nom);
			c.setSolde(solde);
			System.out.println(c);
			
			//Saisir montant à ajouter
			System.out.println("Saisir montant à ajouter");
			montant = clavier.nextLong();
			cs.ajouter(c, montant);
			//Afficher après ajout
			System.out.println(c);
			
			//Saisir montant à retirer
			System.out.println("Saisir montant à retirer");
			montant = clavier.nextLong();
			cs.retirer(c, montant);
			//Afficher après retrait
			System.out.println(c);
			*/
		}
				
		
		clavier.close();
	
	}
}