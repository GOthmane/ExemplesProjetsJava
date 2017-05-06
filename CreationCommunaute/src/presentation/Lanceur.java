package presentation;

import java.util.Scanner;
import metier.Personne;
import service.PersonneService;
/**
 * Classe de d�marrage de l'application
 * @author Stagiaire
 * @version 1.0
 *
 */
public class Lanceur {
	/**
	 * La m�thode main est charg�e en m�moire au d�marrage de l'application
	 * et peut donc �tre utilis�e avant la cr�ation de tout objet
	 * @param args arguments de la m�thode main
	 */
	public static void main(String[] args) {
		// Instantiation d'un objet de la couche PersonneService
		PersonneService ps = new PersonneService();
		
		// Cr�ation d'un objet Personne
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
		// R�cup�rer le nom
		String leNom = clavier.nextLine();
		// Demander le pr�nom
		System.out.println("Saisir le pr�nom");
		// R�cup�rer le pr�nom
		String lePrenom = clavier.nextLine();
		// Demander le pr�nom
		System.out.println("Saisir l'�ge");
		// R�cup�rer le pr�nom
		int lAge = clavier.nextInt();
		Personne p4 = new Personne(leNom, lePrenom, lAge);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(p4);
		clavier.close();
	}
	

}
