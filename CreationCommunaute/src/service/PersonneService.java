package service;

import metier.Personne;

public class PersonneService {

	public String marcher(Personne p)
	{
		return p.getNom() + " MARCHE";
	}
	
	public String arreter(Personne p)
	{
		return p.getNom()+ " S'ARRETE";
	}
	
}
