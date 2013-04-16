package questao3;

public class TesteImpostos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Produto p1, p2, p3;
		p1 = new ProdutoComum("Multivac", 1000.00);
		p2 = new ProdutoEspecial("HAL9000", 2000.00);
		p3 = new ProdutoEspecial("Ziggy", 5000.29);
		System.out.println(p1);
		System.out.println(p2.getDescricao());
		System.out.println(p2.getValorBase());
		System.out.println(p3.getValorTaxas());
		System.out.println(p3.getValorFinal());
	}
}
