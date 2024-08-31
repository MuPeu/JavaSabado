package aula3;

import java.util.Locale;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		//Entrada
		System.out.print("Digite um número qualquer:");
		
		double numero = teclado.nextDouble();
		
		//Processamento
		double potencia = Math.pow(numero, 2);
		int potencia2 = (int) Math.pow(numero, 2);
		
		//Saída
		System.out.println("O quadrado de "+numero+" é: "+potencia);
		System.out.println("O quadrado de "+numero+" é: "+potencia2);
		
		teclado.close();

	}

}
