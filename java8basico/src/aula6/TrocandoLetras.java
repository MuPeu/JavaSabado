package aula6;

import java.util.Scanner;

public class TrocandoLetras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine();
		
		System.out.println("Sua frase: " + frase);
		System.out.println("Tirando os espaços: " + frase.replace(" ", ""));
		System.out.println("Trocando \"a\" por \"u\": " + frase.replace("a", "u"));

		teclado.close();
		
	}

}
