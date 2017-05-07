package metier;

public class PaireGenerique <T> {
	
	private T premier;
	private T second;
	
	public PaireGenerique(T premier, T second) {
		super();
		this.premier = premier;
		this.second = second;
	}

	public T getPremier() {
		return premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "PaireGenerique [premier=" + premier + ", second=" + second + "]";
	}	

}
