package questao3;

public class ProdutoComum extends Produto {

	public ProdutoComum(String descricao, double valorBase) {
		super(descricao, valorBase);
	}

	@Override
	public double getValorTaxas() {
		return .11 * getValorBase();
	}

}
