package questao4;

public class Ponto {

	private double x, y;

	public Ponto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getDistancia(Ponto p) {
		return Math.sqrt(Math.pow(x - p.x, 2.0) 
				+ Math.pow(y - p.y, 2.0));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("Ponto [x=%s, y=%s]", x, y);
	}

}
