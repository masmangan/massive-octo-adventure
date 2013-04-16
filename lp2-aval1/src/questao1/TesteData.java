package questao1;

import java.util.Date;

public class TesteData {
	public static void main(String[] args) {
		System.out.println("Testes");
		Date d1 = new Date(16, 3, 2013);
		System.out.println(d1.getDay());
		Data dd1 = new Data(16, 4, 2013);
		System.out.println(dd1.getDiaDaSemana());	
		
		Date d2 = new Date(24, 3, 1982);
		System.out.println(d2.getDay());
		Data dd2 = new Data(24, 4, 1982);
		System.out.println(dd2.getDiaDaSemana());	
	}
}
