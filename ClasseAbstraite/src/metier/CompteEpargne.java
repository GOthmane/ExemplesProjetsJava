package metier;

public class CompteEpargne extends Compte {
	private float taux;

	public CompteEpargne(float taux) {
		super();
		this.taux = taux;
	}
	
	
	public CompteEpargne(int id, String nom, float solde, float taux) {
		super(id, nom, solde);
		this.taux = taux;
	}
	
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [" + super.toString() + " taux = " + taux + "]";
	}
	
	/**
	 * Calcul interets
	 * @return interets
	 */
	public float calculInterets(){
		return this.solde*this.taux;
	}


	@Override
	public float retirer(float mt) {
		if(mt>=0)
			if(mt<=solde)
		{
		this.solde-=mt;
		}
		return solde;
	}

}
