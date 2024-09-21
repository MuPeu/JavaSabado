package aula6;

import java.util.Scanner;

public class TamanhoDaFrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Forneça uma frase: ");
		String frase = teclado.nextLine();
		
		//Processamento
		int tamanho = frase.length();
		
		//Saída
		System.out.printf("\nFrase: %s\nQuantidade de caracteres: %d", frase, tamanho);
		
		teclado.close();

	}

}
