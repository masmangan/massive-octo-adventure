package questao3;

public class ProdutoEspecial extends Produto {

	public ProdutoEspecial(String descricao, double valorBase) {
		super(descricao, valorBase);
	}

	@Override
	public double getValorTaxas() {
		return Math.max(143.0, .08 * getValorBase());
	}

}
