package metier;

public class Voiture {
	
	private int idVoiture;
	private String marqueVoiture;
	private String couleurVoiture;
	
	private Personne proprietaire;

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getMarqueVoiture() {
		return marqueVoiture;
	}

	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}

	public String getCouleurVoiture() {
		return couleurVoiture;
	}

	public void setCouleurVoiture(String couleurVoiture) {
		this.couleurVoiture = couleurVoiture;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	/* Il faut enlever l'attribut proprietaire du toString() car 
	 * sinon l'appel de System.out.println(p) fait appel au 
	 * toString() de Personne puis à celui de voiture et donc
	 * tourne en boucle */

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", marqueVoiture=" + marqueVoiture + ", couleurVoiture="
				+ couleurVoiture + "]";
	}

}
