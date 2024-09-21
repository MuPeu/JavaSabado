package aula6;

import java.util.Scanner;
import java.util.Locale;

public class ArredondarParaBaixo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		teclado.useLocale(Locale.US);
		
		//Entrada
		System.out.print("Informe sua nota: ");
		float nota = teclado.nextFloat();   //Armazenando na váriavel "nota"
		
		//Processamento e Saída
		System.out.printf("\nA nota original é: %.2f", nota);
		System.out.print("\n\nNota arredondada para baixo: " + Math.floor(nota));
		
		teclado.close();

	}

}
