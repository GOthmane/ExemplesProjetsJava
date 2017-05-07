package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class CompteService {

	/**
	 * Methode pour ajouter un montant au solde du compte c
	 * @param c compte
	 * @param montant montant à ajouter
	 * @return nouveau solde
	 */
	public long ajouter(Compte c, long montant)
	{
		if (montant >= 0)
		{
		c.setSolde(c.getSolde() + montant);
		}
		return c.getSolde();
	}
	
	/**
	 * Methode pour retirer un montant au solde du compte c
	 * @param c compte
	 * @param montant montant à ajouter
	 * @return nouveau solde
	 */
	public long retirer(Compte c, long montant) throws MontantNegatifException, SoldeInsuffisantException
	{
		if(montant>=0)
		{
			if(montant<=c.getSolde())
			{
				c.setSolde(c.getSolde() - montant);
				
			}
			else throw new SoldeInsuffisantException("SOLDE INSUFFISANT");
				
		}
		else throw new MontantNegatifException("MONTANT NEGATIF");
		
		return c.getSolde();
	}
	
}
