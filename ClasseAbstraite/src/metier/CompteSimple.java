package metier;

public class CompteSimple extends Compte {
	private float decouvert;

	public CompteSimple(float decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteSimple(int id, String nom, float solde, float decouvert) {
		super(id, nom, solde);
		this.decouvert = decouvert;
	}
	
	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple [" + super.toString() + " decouvert = " + decouvert + "]";
	}

	
	@Override
	public float retirer(float mt) {
		if(mt>=0)
			if(mt<=solde+decouvert)
		{
		this.solde-=mt;
		}
		return solde;
	}


}
