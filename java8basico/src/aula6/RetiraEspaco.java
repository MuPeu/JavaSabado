package aula6;

import java.util.Scanner;

public class RetiraEspaco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.print("Entre com uma frase: ");
		String frase = teclado.nextLine();
		
		frase = "      " + frase + "      ";
		
		System.out.println("Com espaço: " + "-" + frase + "-");
		System.out.println("Sem espaço: " + "-" + frase.trim() + "-");
		
		teclado.close();
		
	}

}
