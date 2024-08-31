package aula3;

import java.util.Scanner;

public class TesteComOu {

	public static void main(String[] args) {
		boolean i;
		System.out.println("Inicio do programa.....\n");
		do {
			//Variavel
			int codigo;
			Scanner teclado = new Scanner(System.in);
		
			//Entrada
			System.out.print("Entre com o código de acesso: ");
			codigo = teclado.nextInt();
		
			i = (codigo == 1 || codigo == 2 || codigo == 3)? true : false;
			
			//Processamento e Saída
			if (codigo == 1 || codigo == 2 || codigo == 3) {
				
			if (codigo == 1)
				System.out.println("Cliente");
			
			if (codigo == 2)
				System.out.println("Funcionário");
			
			if (codigo == 3)
				System.out.println("Gestor");
			
			}
			else {
			System.out.println("\nCódigo informe é inválido!");
			System.out.println("Tente novamente\n");
			
			}
		
			teclado.close();
			
		} while(i != true);
	}

}
