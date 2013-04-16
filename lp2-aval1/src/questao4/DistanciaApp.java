package questao4;

public class DistanciaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ponto a = new Ponto(0, 0);
		Ponto b = new Ponto(0, 3);
		Ponto c = new Ponto(4, 0);

		double dab = a.getDistancia(b);
		double dac = a.getDistancia(c);
		double dbc = b.getDistancia(c);

		if (dab > dbc) {
			double tmp = dab;
			dab = dbc;
			dbc = tmp;
		}
		
		if (dac > dbc) {
			double tmp = dac;
			dac = dbc;
			dbc = tmp;
		}
		
		System.out.println(dab);
		System.out.println(dac);
		System.out.println(dbc);
		
		if (dbc * dbc == dab * dab + dac * dac)
			System.out.println("Retângulo!");
	}
}
