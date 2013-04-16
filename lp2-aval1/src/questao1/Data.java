package questao1;

public class Data {

	private int dia;
	private int mes;
	private int ano;	// 1700 e 2099
	
	public Data(int dia, int mes, int ano) {
		super();
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}



	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		//TODO: verificar valor
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		// TODO: verificar valor
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		// TODO: verificar valor	
		this.ano = ano;
	}

	/**
	 * 
	 * @return um valor entre 0 e 6, domingo é o dia 0
	 */
	public int getDiaDaSemana() {
		//TODO: utilizar tabelas
		return 0;
	}
}
