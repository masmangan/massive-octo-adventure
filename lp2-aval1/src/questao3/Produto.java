package questao3;

public abstract class Produto {

	private String descricao;
	private double valorBase;
	
	public Produto(String descricao, double valorBase) {
		this.descricao = descricao;
		this.valorBase = valorBase;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorBase() {
		return valorBase;
	}

	public abstract double getValorTaxas();

	public double getValorFinal() {
		double taxas = getValorTaxas();
		double total = getValorBase() + getValorTaxas();
		if (taxas > 4000.0)
			total = total * 1.03;
		return total;
	}

}
