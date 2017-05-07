package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

/**
 * Classe de d�marrage de l'application
 * @author Stagiaire
 * @version 1.0
 */
public class Lanceur {

	/**
	 * La m�thode main est charg�e en m�moire au d�marrage de l'application
	 * et peut donc �tre utilis�e avant la cr�ation de tout objet
	 * @param args arguments de la m�thode main
	 */
	public static void main(String[] args) {
		
		// Instanciation d'un objet de la classe CompteService
		CompteService cs = new CompteService();
		
		// Cr�ation d'un objet Compte
		Compte c = new Compte();
		
		// Appel aux m�thodes
		
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
				// R�cup�ration des donn�es saisies par l'utilisateur
				System.out.println("Saisir idCompte");
				id=clavier.nextInt();
				clavier.nextLine();
				System.out.println("Saisir nom du compte");
				nom=clavier.nextLine();
				System.out.println("Saisir solde");
				solde=clavier.nextLong();
				//Affectation de donn�es � l'objet compte
				c.setIdCompte(id);
				c.setNomCompte(nom);
				c.setSolde(solde);
				System.out.println(c);
				break;
			}
			case 2 :
			{
				//Saisir montant � ajouter
				System.out.println("Saisir montant � ajouter");
				montant = clavier.nextLong();
				cs.ajouter(c, montant);
				//Afficher apr�s ajout
				System.out.println(c);
				break;
			} 
			case 3 :
			{
				//Saisir montant � retirer
				System.out.println("Saisir montant � retirer");
				montant = clavier.nextLong();
				cs.retirer(c, montant);
				//Afficher apr�s retrait
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
				
			
			/*R�cup�ration des donn�es saisies par l'utilisateur
			System.out.println("Saisir idCompte");
			id=clavier.nextInt();
			clavier.nextLine();
			System.out.println("Saisir nom du compte");
			nom=clavier.nextLine();
			System.out.println("Saisir solde");
			solde=clavier.nextLong();
			//Affectation de donn�es � l'objet compte
			c.setIdCompte(id);
			c.setNomCompte(nom);
			c.setSolde(solde);
			System.out.println(c);
			
			//Saisir montant � ajouter
			System.out.println("Saisir montant � ajouter");
			montant = clavier.nextLong();
			cs.ajouter(c, montant);
			//Afficher apr�s ajout
			System.out.println(c);
			
			//Saisir montant � retirer
			System.out.println("Saisir montant � retirer");
			montant = clavier.nextLong();
			cs.retirer(c, montant);
			//Afficher apr�s retrait
			System.out.println(c);
			*/
		}
				
		
		clavier.close();
	
	}
}