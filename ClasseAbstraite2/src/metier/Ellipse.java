package metier;

public class Ellipse extends Forme {

	private float petitAxe, grandAxe;
	
	public Ellipse(float petitAxe, float grandAxe) {
		super();
		this.petitAxe = petitAxe;
		this.grandAxe = grandAxe;
	}

	public float getPetitAxe() {
		return petitAxe;
	}

	public void setPetitAxe(float petitAxe) {
		this.petitAxe = petitAxe;
	}
	
	public float getGrandAxe() {
		return grandAxe;
	}

	public void setGrandAxe(float grandAxe) {
		this.grandAxe = grandAxe;
	}

	@Override
	public float perimetre() {
		float resultat = 0;
		float pcarre = petitAxe*petitAxe;
		float gcarre = grandAxe*grandAxe;
		float sinus, cosinus;
		
		for (int i = 0; i<1000; i++) {
			sinus = (float) Math.sin(i*Math.PI/2000);
			cosinus = (float) Math.cos(i*Math.PI/2000);
			resultat += Math.sqrt(pcarre * sinus * sinus + gcarre * cosinus * cosinus);
		}
		resultat *= 4*Math.PI / 2000;
		return resultat;
	}

	@Override
	public float surface() {
		return (float)Math.PI * petitAxe * grandAxe;
	}

	@Override
	public String toString() {
		return "Ellipse [petitAxe=" + petitAxe + ", grandAxe=" + grandAxe + "]";
	}

}
