package metier;

/**
 * Classe personne qui sert �
 * d�finir une personne
 * @author Stagiaire
 * @version 1.0
 *
 */

public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	/**
	 * Premi�re m�thode constructeur Personne
	 * @param nom nom de la personne
	 * @param prenom pr�nom de la personne
	 * @param age age de la personne
	 */
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	/**
	 * Deuxi�me m�thode constructeur Personne
	 */
	public Personne() {
		super();
	}
	
	/**
	 * Troisi�me m�thode constructeur Personne
	 * @param nom nom de la personne
	 * @param prenom pr�nom de la personne
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * getter de l'attribut nom
	 * @return nom de la personne
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * setter de l'attribut nom
	 * @param nom nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * getter de l'attribut prenom
	 * @return pr�nom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * setter de l'attribut prenom
	 * @param prenom pr�nom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * getter de l'attribut age 
	 * @return age de la personne
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setter de l'attribut age
	 * @param age age de la personne
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Methode de l'affichage
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
	
}
