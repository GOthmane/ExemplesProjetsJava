package metier;

public class ComptePayant extends Compte {

	private float pourcentage;

	/**
	 * constructeur 
	 * @param pourcentage pourcentage de frais
	 */
	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	/**
	 * constructeur 
	 * @param id id compte
	 * @param nom nom du compte
	 * @param solde solde du compte
	 * @param pourcentage pourcentage
	 */

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [pourcentage=" + pourcentage + ", toString()=" + super.toString() + "]";
	}
	
	
}
