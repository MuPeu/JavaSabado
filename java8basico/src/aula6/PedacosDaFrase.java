package aula6;

import java.util.Scanner;

public class PedacosDaFrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Escreva uma frase bem bacana: ");
		String frase = teclado.nextLine();
		
		System.out.println("A frase inserida foi: " + frase);
		System.out.println("\n(0, 2): " + frase.substring(0,2));
		System.out.println("(0, 8): " + frase.substring(0,8));
		System.out.println("(5, 11): " + frase.substring(8,11));
		System.out.println("(12, 14): " + frase.substring(11,14));
		
		teclado.close();
		
	}

}
