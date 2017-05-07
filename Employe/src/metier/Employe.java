package metier;

public class Employe {
	
	private String nom;
	private String prenom;
	private long id;
	
	public Employe(String nom, String prenom, long id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}


	public Employe() {
		super();
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}
	
	
}
