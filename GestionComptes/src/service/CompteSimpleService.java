package service;

import metier.Compte;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class CompteSimpleService extends CompteService{

	@Override
	public long retirer(Compte c, long montant) throws SoldeInsuffisantException, MontantNegatifException {

		if(montant >=0)
		{
			if(montant<=c.getSolde())
			{
				c.setSolde(c.getSolde()-montant);
			}
			
			else
				throw new SoldeInsuffisantException("SOLDE INSUFFISANT");
		}
		else 
			throw new  MontantNegatifException(" MONTANT NEGATIF");
		
			return c.getSolde();
	}

}
