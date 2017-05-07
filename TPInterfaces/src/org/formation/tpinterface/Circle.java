package org.formation.tpinterface;

public class Circle implements IPrintable, IFXDrawable, ISurface {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public String getShape() {
		return "Javafx non installé";
	}

	@Override
	public void printMe(String text) {
		System.out.println("text");

	}

}
