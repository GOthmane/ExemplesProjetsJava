package service;

import metier.Compte;

public class ComptePayantService extends CompteService {

	@Override
	public float verser(Compte c, float mt) {
		if (mt>=0)
		{
			c.setSolde(c.getSolde()+mt);
		}
		return c.getSolde();
	}

	public float verser(Compte c, float mt, float pourcentage) {
		if (mt>=0)
		{
			c.setSolde(c.getSolde() + mt - pourcentage*mt/100);
		}
		return c.getSolde();
	}
	
}
