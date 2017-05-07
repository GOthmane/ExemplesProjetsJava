package metier;

public class Carre extends Forme {

	private float cote;
	
	public Carre(float cote) {
		super();
		this.cote = cote;
	}

	
	public float getCote() {
		return cote;
	}

	public void setCote(float cote) {
		this.cote = cote;
	}
	
	@Override
	public float perimetre() {
		return 4*cote;
	}

	@Override
	public float surface() {
		return cote*cote;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + "]";
	}
	
	

}
