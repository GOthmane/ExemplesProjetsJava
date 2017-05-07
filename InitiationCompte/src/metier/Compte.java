package metier;

/**
 * Classe qui sert à
 * définir un compte
 * @author Stagiaire
 * @version 1.0
 *
 */
public class Compte {

	int idCompte;
	String nomCompte;
	long solde;

	/**
	 * Méthode constructeur Compte
	 * @param idcompte numéro de compte
	 * @param nomCompte nom du compte
	 * @param solde solde
	 */
	public Compte(int idcompte, String nomCompte, long solde) {
		super();
		this.idCompte = idcompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}

	/**
	 * 2e méthode constructeur Compte
	 */
	public Compte() {
		super();
	}



	/**
	 * getter de l'attribut idcompte
	 * @return the idcompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * setter de l'attribut idcompte
	 * @param idcompte the idcompte to set
	 */
	public void setIdCompte(int idcompte) {
		this.idCompte = idcompte;
	}

	/**
	 * getter de l'attribut nomCompte
	 * @return the nomCompte
	 */
	public String getNomCompte() {
		return nomCompte;
	}

	/**
	 * setter de l'attribut nomCompte
	 * @param nomCompte the nomCompte to set
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	/**
	 * getter de l'attribut solde
	 * @return the solde
	 */
	public long getSolde() {
		return solde;
	}

	/**
	 * setter de l'attribut solde
	 * @param solde the solde to set
	 */
	public void setSolde(long solde) {
		this.solde = solde;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	/**
	 * Méthode d'affichage
	 */
	public String toString() {
		return "Compte [idcompte=" + idCompte + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}

	
	
	
	
	
}
