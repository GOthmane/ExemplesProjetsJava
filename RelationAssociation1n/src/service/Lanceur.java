package service;

import metier.Personne;
import metier.Voiture;

public class Lanceur {

	public static void main(String[] args) {
		
		// Service
		IService service = new Service();
		
		// Personne
		Personne p = new Personne();
		p.setIdPersonne(1);
		p.setNomPersonne("X");
		p.setPrenomPersonne("Mister");
		
		//  Voitures
		Voiture v = new Voiture();
		v.setIdVoiture(1);
		v.setCouleurVoiture("rouge");
		v.setMarqueVoiture("ferrari");
		Voiture v2 = new Voiture();
		v2.setIdVoiture(2);
		v2.setCouleurVoiture("verte");
		v2.setMarqueVoiture("clio");
		
		//  Ajout
		System.out.println(p);
		service.ajouterVoiture(p, v);
		service.ajouterVoiture(p, v2);
		System.out.println(p);

	}

}
