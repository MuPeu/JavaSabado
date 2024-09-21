package aula6;

import java.util.Scanner;

public class LetrasNaPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = teclado.nextLine();
		int tamanho = palavra.length();
		
		System.out.println("\nPalavra: " + palavra + "\n");
		
		for(int i = 0; i < tamanho; i++) {
		System.out.println("A Primeira Letra é: " + palavra.charAt(i));
		}
		teclado.close();
		
	}

}
