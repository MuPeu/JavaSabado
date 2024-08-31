package aula3;

import java.util.Scanner;

public class TesteDeValor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		//Variavel
		int num;
		
		System.out.println("Olá humano.");
		System.out.print("Por favor, informe um número inteiro: ");
		num = teclado.nextInt();
		
		if (num > 20 && num < 90) {
			System.out.printf("\nO número informado, se encontra entre 20 e 90. O número é: %d",num);
		}
		else {
			System.out.printf("\nO número informado, não se encontra entre 20 e 90. O número é: %d",num);
		}

		teclado.close();
		
	}

}
