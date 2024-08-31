package aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadorSoma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);   //Capturar a entrada via teclado
		teclado.useLocale(Locale.US);
		
		//Entrada
		System.out.println("Operação de Adição:");
		System.out.println("Digite um número:");

		float num1 = teclado.nextFloat();   //Armazena variável num1
		
		System.out.println("Caro Alien, digite outro número:");
		
		float num2 = teclado.nextFloat();   //Armazena variável num2
		
		//Processamento
		float soma = num1 + num2;   //Armazena a soma de num1 com num2
		
		//Saída
		System.out.printf("A soma de "+num1+", e de "+num2+", é: "+soma);
		
		teclado.close();
		
	}

}
