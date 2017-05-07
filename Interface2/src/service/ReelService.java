package service;

import metier.Reel;

public class ReelService implements IReelService {

	@Override
	public Reel addition(Reel x, Reel y) {
		Reel r = new Reel(x.getX()+y.getX());
		return r;
	}

	@Override
	public Reel soustraction(Reel x, Reel y) {
		Reel r = new Reel(x.getX()-y.getX());
		return r;
	}
	
	

}
