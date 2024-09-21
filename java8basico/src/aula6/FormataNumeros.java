package aula6;

import java.text.DecimalFormat;

public class FormataNumeros {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		
		short idade = 39;
		df.applyPattern("000");
		System.out.println(df.format(idade));
		
		int quantidade = 10000;
		df.applyPattern("#0,000");
		System.out.println(df.format(quantidade));
		
		long estoque = 41198764;
		df.applyPattern("#,##0,000");
		System.out.println(df.format(estoque));

		float altura = 1.74f;
		df.applyPattern("#0.00");
		System.out.println(df.format(altura));
		
		double valorEmReais = 2583.75;
		df.applyPattern("R$ #,##0.00");
		System.out.println(df.format(valorEmReais));
		
	}

}
