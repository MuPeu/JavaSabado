package aula8;

import java.util.Arrays;

public class ArrayOrdenada {

	public static void main(String[] args) {
		String[] nomes = {"Lucas", "Daniel", "Julia", "Taciana", "Isabela", "Matheus"};
		char[] vogais = {'I', 'G', 'A', 'O', 'E'};
		int[] numeros = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
		float[] notas = {7.6f, 8.5f, 9.7f, 5.4f, 3.6f, 2.8f};
		
		Arrays.sort(nomes);
		System.out.println("Nomes: ");
		for (String nome : nomes) {
			System.out.printf(nome + ", ");
		}
		
		Arrays.sort(vogais);
		System.out.println("\n\nVogais: ");
		for (char vogal : vogais) {
			System.out.printf(vogal + ", ");
		}
		
		Arrays.sort(numeros);
		System.out.println("\n\nNúmeros: ");
		for (int numero : numeros) {
			System.out.printf(numero + ", ");
		}
		
		Arrays.sort(notas);
		System.out.println("\n\nNotas: ");
		for (float nota : notas) {
			System.out.printf(nota + ", ");
		}

	}

}
