package presentation;

import java.util.Scanner;
import metier.Personne;
import service.PersonneService;
/**
 * Classe de démarrage de l'application
 * @author Stagiaire
 * @version 1.0
 *
 */
public class Lanceur {
	/**
	 * La méthode main est chargée en mémoire au démarrage de l'application
	 * et peut donc être utilisée avant la création de tout objet
	 * @param args arguments de la méthode main
	 */
	public static void main(String[] args) {
		// Instantiation d'un objet de la couche PersonneService
		PersonneService ps = new PersonneService();
		
		// Création d'un objet Personne
		Personne p = new Personne();
		Personne p2 = new Personne ("Y", "Miss", 40);
		Personne p3 = new Personne("Z", "Mister");
		// Valorisation des attributs
		p.setPrenom("Mister");
		p.setNom("X");
		p.setAge(30);
		p3.setAge(50);
		// Affichage des attributs
		System.out.println(p);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(p2);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(p3);
		System.out.println(ps.marcher(p));
		System.out.println(ps.arreter(p2));
		
		// Test de la classe Scanner
		Scanner clavier = new Scanner(System.in);
		// Demander le nom
		System.out.println("Saisir le nom");
		// Récupérer le nom
		String leNom = clavier.nextLine();
		// Demander le prénom
		System.out.println("Saisir le prénom");
		// Récupérer le prénom
		String lePrenom = clavier.nextLine();
		// Demander le prénom
		System.out.println("Saisir l'âge");
		// Récupérer le prénom
		int lAge = clavier.nextInt();
		Personne p4 = new Personne(leNom, lePrenom, lAge);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(p4);
		clavier.close();
	}
	

}
