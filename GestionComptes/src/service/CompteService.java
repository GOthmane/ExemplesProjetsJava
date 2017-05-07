package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public abstract class CompteService {

	public long ajouter(Compte c, long montant)
	{
		if(montant >=0)
		{
			c.setSolde(c.getSolde()+montant);
		}
		return c.getSolde();
	}
	
	public abstract long retirer(Compte c, long montant) throws SoldeInsuffisantException, MontantNegatifException;
	/*public long retirer(Compte c, long montant)
	{
		if(montant >=0)
		{
			if(montant<=c.getSolde())
			{
				c.setSolde(c.getSolde()-montant);
			}
		}
		return c.getSolde();
		
	}*/
}
