package metier;

public class ClasseGenerique <T1,T2, T3> {
	private T1 X;
	private T2 Y;
	private T3 Z;
	
	public ClasseGenerique(T1 x, T2 y, T3 z) {
		super();
		X = x;
		Y = y;
		Z = z;
	}

	public T1 getX() {
		return X;
	}

	public void setX(T1 x) {
		X = x;
	}

	public T2 getY() {
		return Y;
	}

	public void setY(T2 y) {
		Y = y;
	}

	public T3 getZ() {
		return Z;
	}

	public void setZ(T3 z) {
		Z = z;
	}

	@Override
	public String toString() {
		return "Classe [X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
	}

}
