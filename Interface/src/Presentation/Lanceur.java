package Presentation;

import service.ClientService;
import service.IClientService;
import service.IVipService;
import service.IVipService2;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration de la classe
		ClientService cs = new ClientService();
		
		//Utilisation de la classe
		cs.direBonjour();
		cs.direAurevoir();
		cs.jeSuisVip();

		
		//Declaration de l'interface
		IClientService s = new ClientService();
		IVipService vs = new ClientService();
		IVipService2 vs2 = new ClientService();
		
		//Utilisation de l'interface
		System.out.println("-----Client normal-----");
		s.direBonjour();
		s.direAurevoir();
		//s.jeSuisVip();
		System.out.println("-----Client VIP-----");
		vs.direBonjour();
		vs.direAurevoir();
		vs.jeSuisVip();
		vs2.direBonjour();
		vs2.direAurevoir();
		vs2.jeSuisVip();

	}

}
