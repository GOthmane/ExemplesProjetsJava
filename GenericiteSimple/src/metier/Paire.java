package metier;

public class Paire {
	Object premier;
	Object second;

		public Paire(Object premier, Object seconde) {
		super();
		this.premier = premier;
		this.second = seconde;
	}

	public Object getPremier() {
		return premier;
	}

	public void setPremier(Object premier) {
		this.premier = premier;
	}

	public Object getSecond() {
		return second;
	}

	public void setSecond(Object second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Paire [premier=" + premier + ", second=" + second + "]";
	}

}
