package aula2;

import java.util.Scanner;   //Importar a biblioteca Scanner

public class EntradaDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do alien:");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota de classificação do alien:");
		float classi = teclado.nextFloat();
		System.out.println("Digite a nota de medo do alien:");
		float medo = teclado.nextFloat();
		double perigo = classi + medo;
		
		System.out.printf("A nota de perigo de: %s, é: %.1f \n", nome, perigo);

		teclado.close();
		
	}

}
