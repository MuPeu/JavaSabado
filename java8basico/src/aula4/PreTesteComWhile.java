package aula4;

import java.util.Scanner;

public class PreTesteComWhile {

	public static void main(String[] args) {
		int i, resp;
		Scanner teclado = new Scanner(System.in);
		
		resp = 1;
		while (resp == 1) {
			System.out.println();
			System.out.println("Início do Programa...");
			
			i = 1;
			while (i <= 5) {
				System.out.println("Valor = " + i);
				i++;
			}
			System.out.println("\nDeseja continuar?");
			System.out.println("Tecle [1] para SIM / [2] para NÃO: ");
			resp = teclado.nextInt();
		}
		
		System.out.println("Fim do Programa...");
		teclado.close();

	}

}
