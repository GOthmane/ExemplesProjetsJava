package metier;

public abstract class Compte {
	private int id;
	private String nom;
	protected float solde;
	private static int nbComptes;
	
	public Compte() {
		super();
		nbComptes++;
	}

	public Compte(int id, String nom, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		nbComptes++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	/**
	 * @return the nbComptes
	 */
	public static int getNbComptes() {
		return nbComptes;
	}

	/**
	 * @param nbComptes the nbComptes to set
	 */
	public static void setNbComptes(int nbComptes) {
		Compte.nbComptes = nbComptes;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", solde=" + solde + "]";		
	}
	
	/**
	 * Methode pour verser de l'argent
	 * @param mt montant a verser
	 * @return solde apres versement
	 */
	public float verser(float mt){
		if (mt>=0)
		{
			this.solde+=mt;
		}
		return solde;
	}
	
	/**
	 * Methode pour retirer de l'argent
	 * @param mt montant a verser
	 * @return solde apres retrait
	 */
	/*public float retirer(float mt){
		if(mt>=0)
			if(mt<=solde)
		{
		this.solde-=mt;
		}
		return solde;
	}*/
	
	public abstract float retirer(float mt);
	
}
