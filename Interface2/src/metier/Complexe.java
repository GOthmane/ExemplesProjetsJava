package metier;

public class Complexe {
	
	private double re;
	private double im;
	
	public Complexe(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	@Override
	public String toString() {
		return "Complexe [im=" + im + ", re=" + re + "]";
	}

	
}
