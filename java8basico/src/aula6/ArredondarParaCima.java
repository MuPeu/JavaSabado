package aula6;

import java.util.Scanner;

public class ArredondarParaCima {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Definir a lotação do ônibus
		final float LOTACAO_ONIBUS = 50.0f;
		System.out.print("Quantas pessoas vão embarcar para o Rock in Rio? ");
		int numeroPassageiros = teclado.nextInt();

		float qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;
		
		System.out.printf("\nQuantidade de passageiros: %d", numeroPassageiros);
		System.out.printf("\n\nQuantidade calculada: %.2f", qtdOnibus);
		System.out.println("\n\nQuantidade de ônibus necessários: " + (int)Math.ceil(qtdOnibus));
		
		teclado.close();

	}

}
