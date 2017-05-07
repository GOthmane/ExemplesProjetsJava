package metier;

public class Reel {

	private double x;

	public Reel(double x) {
		super();
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Reel [x=" + x + "]";
	}
	
}
