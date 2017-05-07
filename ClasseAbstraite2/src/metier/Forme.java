package metier;

public abstract class Forme {
	
	public abstract float perimetre();
	public abstract float surface();
	public float coefficientEtalement() {
		float lePerimetre = perimetre();
		return 16 * surface() / (lePerimetre * lePerimetre);
	}

}
