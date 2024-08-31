package aula4;

import java.util.Scanner;

public class CarrinhoDeMercado {

	public static void main(String[] args) {
		//Variaveis
		double valor_total_compra = 0.0;
		float valor_feijao = 5.5f;
		float valor_arroz = 4.1f;
		float valor_macarrao = 2.3f;
		
		String produto, produto2, produto3;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada1
		System.out.println("Digite o nome do produto:");
		System.out.println("Feijão, Arroz ou  Macarrão.");
		produto = teclado.nextLine();
		
		//Processamento1
		if (produto.equals("feijão"))
			valor_total_compra += valor_feijao;
		else if (produto.equals("arroz"))
			valor_total_compra += valor_arroz;
		else if (produto.equals("macarrão"))
			valor_total_compra += valor_macarrao;
		else
			System.out.println("Produto Inválido!");
		
		//Entrada2
		System.out.println("\nDigite o nome de outro produto:");
		System.out.println("Feijão, Arroz ou  Macarrão.");
		produto2 = teclado.nextLine();
		
		//Processamento2
		if (produto2.equals("feijão"))
			valor_total_compra += valor_feijao;
		else if (produto2.equals("arroz"))
			valor_total_compra += valor_arroz;
		else if (produto2.equals("macarrão"))
			valor_total_compra += valor_macarrao;
		else
			System.out.println("Produto Inválido!");
		
		//Entrada3
		System.out.println("\nDigite o nome de outro produto:");
		System.out.println("Feijão, Arroz ou  Macarrão.");
		produto3 = teclado.nextLine();
		
		//Processamento3
		if (produto3.equals("feijão"))
			valor_total_compra += valor_feijao;
		else if (produto3.equals("arroz"))
			valor_total_compra += valor_arroz;
		else if (produto3.equals("macarrão"))
			valor_total_compra += valor_macarrao;
		else
			System.out.println("Produto Inválido!");
		
		//Saída
		System.out.printf("\nO valor total da compra é: R$%.2f", valor_total_compra);
		
		teclado.close();
		
	}

}
