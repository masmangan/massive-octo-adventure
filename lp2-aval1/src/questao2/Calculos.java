package questao2;

/*
 * No Eclipse, utilizar menu Run, Run configurations...
 * Indicar em Arguments, na caixa Program Arguments: 12
 * Resultado:
 * Cálculos
 * [12 1][13 2][14 4][15 8]
 */
public class Calculos {
	public static void main(String[] v) {
		System.out.println("Cálculos");
		int a = Integer.parseInt(v[0]);
		int b = 1;
		while (b < a) {
			System.out.printf("[%d %d]", a, b);
			a++;
			b = b * 2;
		}
	}
}
