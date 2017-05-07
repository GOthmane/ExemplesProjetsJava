package service;

import java.util.Collection;

import metier.Personne;
import metier.Voiture;

public interface IService {
	
	public void ajouterVoiture(Personne p, Voiture v);
	public Collection<Voiture> afficheVoiture(Personne p);

}
