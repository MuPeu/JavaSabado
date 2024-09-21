package aula6;

import java.util.Scanner;

public class TransformacoesNaFrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = teclado.nextLine();

		System.out.println("\nA frase é: " + frase);
		frase = frase.toUpperCase();
		System.out.println("Tudo em maiusculo: " + frase);
		frase = frase.toLowerCase();
		System.out.println("Tudo em minusculo: " + frase);

		teclado.close();
		
	}

}
