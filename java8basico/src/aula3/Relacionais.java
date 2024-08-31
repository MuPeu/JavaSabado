package aula3;

import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = teclado.nextInt();
		System.out.println("Informe o sengundo número:");
		int num2 = teclado.nextInt();
		
		//Processamento
		
		boolean igualdade = (num1 == num2);   //Testa a igualdade
		boolean maior = (num1 > num2);   //Testa se num1 é maior que num2
		boolean menor = (num1 < num2);   //Testa se num1 é menor que num2
		boolean diferente = (num1 != num2);   //Testa se num1 é diferente de num2
		boolean maiorigual = (num1 >= num2);   //Testa se num1 é maior ou igual a num2
		boolean menorigual = (num1 <= num2);   //Testa se num1 é menor ou igual a num2
		
		//Saída
		System.out.printf("Igualdade entre %d == %d resultado em %b \n", num1, num2, igualdade);
		System.out.printf("Diferença entre %d != %d resultado em %b \n", num1, num2, diferente);
		System.out.printf("Maior que entre %d > %d resultado em %b \n", num1, num2, maior);
		System.out.printf("Menor que entre %d < %d resultado em %b \n", num1, num2, menor);
		System.out.printf("Maior ou igual que entre %d >= %d resultado em %b \n", num1, num2, maiorigual);
		System.out.printf("Menor ou igual que entre %d <= %d resultado em %b \n", num1, num2, menorigual);

		teclado.close();
		
	}

}
