package questao2;

public class Calculos {
	public static void main(String[] v) {
		System.out.println("C�lculos");
		int a = Integer.parseInt(v[0]);
		int b = 1;
		while (b < a) {
			System.out.printf("[%d %d]", a, b);
			a++;
			b = b * 2;
		}
	}
}
