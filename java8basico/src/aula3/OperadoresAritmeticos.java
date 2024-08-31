package aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale(Locale.US);
		
		//Entrada
		System.out.println("Exemplos de Operações Aritméticas");
		System.out.print("Digite um número qualquer:");
		
		float num1 = teclado.nextFloat();
		
		System.out.print("Digite outro número qualquer:");
		
		float num2 = teclado.nextFloat();
		
		//Processamento
		float num1maisnum2 = num1 + num2;
		float num1menosnum2 = num1 - num2;
		float num1vezesnum2 = num1 * num2;
		float num1divididonum2 = num1 / num2;
		int num1restonum2 = (int) (num1 % num2); // type casting
		
		//Saída
		System.out.println("O resultado da soma entre "+num1+", e "+num2+", é: "+num1maisnum2);
		System.out.println("O resultado da subtração entre "+num1+", e "+num2+", é: "+num1menosnum2);
		System.out.println("O resultado da multiplicação entre "+num1+", e "+num2+", é: "+num1vezesnum2);
		System.out.println("O resultado da divisão entre "+num1+", e "+num2+", é: "+num1divididonum2);
		System.out.println("O resto da divisão entre "+num1+", e "+num2+", é: "+num1restonum2);
		
		teclado.close();
		
	}

}
