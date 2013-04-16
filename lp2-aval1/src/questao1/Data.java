package questao1;

public class Data {

	private int dia;
	private int mes;
	private int ano; // 1700 e 2099

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
		// TODO: verificar valor
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
		// FIXME: resultado incorreto para 16/04/2013
		// 1. Procure 1900 na coluna séculos
		int[] seculos = { 4, 0, 0, 6 };
		int s = seculos[ano / 100 - 17];
		System.out.printf("1=%d\n", s);

		// 2. Pegue os dois últimos digitos do ano
		int digitos = ano % 100;
		System.out.printf("2=%d\n", digitos);

		// 3. Realize a divisão inteira por 4
		int d = digitos / 4;
		System.out.printf("3=%d\n", d);

		// 4. Procure abril na coluna de meses
		int c;
		switch (mes) {
		// TODO: restante da tabela
		case 1:
		case 10:
			c = 0;
			break;
		case 5:
			c = 1;
			break;
		//case 2: bissexto
		case 8:
			c = 2;
			break;
		case 2:
		case 3:
		case 11:
			c = 3;
			break;		
		case 4:
			c = 6;
			break;
		default:
			c = 0;
		}
		System.out.printf("4=%d\n", c);

		// 5. Some todos os resultados ao dia do mês
		int r = s + digitos + d + c + dia;
		System.out.printf("5=%d\n", r);

		// 6. Obtenha o resto da divisão por 7
		System.out.printf("6=%d\n", r % 7);

		return r % 7;
	}
}
