package aula4;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		//Variavel
		String name;
		double alt, peso, imc;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite seu nome: ");
		name = teclado.nextLine();
		
		System.out.print("Digite o seu peso (em Kg): ");
		peso = teclado.nextDouble();
		
		System.out.print("Digite a sua altura (em metros): ");
		alt = teclado.nextDouble();
		
		//Processamento
		imc = peso / Math.pow(alt,2);
		
		//Saída
		if (imc <= 1.9)
			System.out.printf("\n%s, você é feito de hélio!\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 2 && imc <= 16.9)
			System.out.printf("\n%s, você está muito abaixo do peso.\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 17 && imc <= 18.4)
			System.out.printf("\n%s, você está abaixo do peso.\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 18.5 && imc <= 24.9)
			System.out.printf("\n%s, seu peso está normal.\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 25 && imc <= 29.9)
			System.out.printf("\n%s, você está acima do peso.\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 30 && imc <= 34.9)
			System.out.printf("\n%s, você está na condição de obesidade grau 1.\nSeu IMC é: %.2f", name, imc);
		else if (imc >= 35 && imc <= 40)
			System.out.printf("\n%s, você está na condição de obesidade grau 2.\nSeu IMC é: %.2f", name, imc);
		else if (imc > 40)
			System.out.printf("\n%s, você está na condição de obesidade grau 3.\nSeu IMC é: %.2f", name, imc);
		
		teclado.close();
	}

}