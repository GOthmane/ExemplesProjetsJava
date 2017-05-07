package metier;

public class Rectangle extends Forme {
	
	private float longueur;
	private float largeur;

	public Rectangle(float longueur, float largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	@Override
	public float perimetre() {
		return 2*(longueur+largeur);
	}

	@Override
	public float surface() {
		return longueur*largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	

}
