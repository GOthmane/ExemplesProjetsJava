package metier;

public class ComptePayant extends Compte {

	private float pourcentage;

	public ComptePayant(float pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}

	
	public ComptePayant(int id, String nom, float solde, float pourcentage) {
		super(id, nom, solde);
		this.pourcentage = pourcentage;
	}

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	@Override
	public String toString() {
		return "ComptePayant [" + super.toString() + " pourcentage = " + pourcentage + "]";
	}


	@Override
	public float verser(float mt) {
		if (mt>=0)
		{
			this.solde = solde + mt - pourcentage*mt/100;
		}
		return solde;
	}
	
	public float retirer(float mt){
		if(mt>=0) {
			if(mt+(mt*pourcentage)/100<= solde){
		this.solde = solde - mt - pourcentage*mt/100;
		}
		}
		return solde;
	}
	
		/*public float verser(float mt){
			;
			return this.solde;
		}
		
		// Redefinition de la methode pour retirer de l'argent, operation payante
		public float retirer(float mt){
			if(mt>=0 & (this.solde-mt-this.pourcentage*mt/100)>=0)
			{
			this.solde = this.solde - mt-this.pourcentage*mt/100;
			}
			return this.solde;
		}
	*/
}
