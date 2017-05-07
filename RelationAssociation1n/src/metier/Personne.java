package metier;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	
	private int idPersonne;
	private String nomPersonne;
	private String prenomPersonne;
	
	// Il faut toujours initialiser une collection
	private Collection<Voiture> mesVoitures = new ArrayList<Voiture>();
	
	public Personne() {
		super();
	}

	public Personne(int idPersonne, String nomPersonne, String prenomPersonne) {
		super();
		this.idPersonne = idPersonne;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public Collection<Voiture> getMesVoitures() {
		return mesVoitures;
	}

	public void setMesVoitures(Collection<Voiture> mesVoitures) {
		this.mesVoitures = mesVoitures;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nomPersonne=" + nomPersonne + ", prenomPersonne="
				+ prenomPersonne + ", mesVoitures=" + mesVoitures + "]";
	}

}
