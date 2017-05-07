package org.formation.tpinterface;

public class AreaCalculator {
	
	public double sumArea(double[] surfaces) {
		double sum = 0.0;
		for (int i=0; i<surfaces.length; i++) {
			sum+=surfaces[i];
		}
		return sum;
		
	}

}
