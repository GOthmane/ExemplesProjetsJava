package service;

public class ClientService implements IClientService, IVipService, IVipService2 {

	@Override
	public void direBonjour() {
		System.out.println("BONJOUR");

	}

	@Override
	public void direAurevoir() {
		System.out.println("AU REVOIR");

	}

	@Override
	public void jeSuisVip() {
		System.out.println("JE SUIS VIP");

	}

}
