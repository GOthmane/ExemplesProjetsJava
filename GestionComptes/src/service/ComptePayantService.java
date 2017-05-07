package service;

import metier.Compte;
import metier.ComptePayant;

public class ComptePayantService extends CompteService {

	@Override
	public long retirer(Compte c, long montant) {
		
		if(montant>=0){
			if(montant+(montant*2)/100 <= c.getSolde())
			{
				//this.solde=solde-montant-(montant*pourcentage)/100;
				c.setSolde(c.getSolde()-montant-(montant*2)/100);
			}
		}
		
		return c.getSolde();
	}
	
public long retirer(ComptePayant c, long montant,int pourcentage) {
		
		if(montant>=0){
			if(montant+(montant*pourcentage)/100 <= c.getSolde())
			{
				//this.solde=solde-montant-(montant*pourcentage)/100;
				c.setSolde(c.getSolde()-montant-(montant*pourcentage)/100);
			}
		}
		
		return c.getSolde();
	}
}


