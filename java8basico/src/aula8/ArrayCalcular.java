package aula8;

public class ArrayCalcular {

	public static void main(String[] args) {
		final int TAMANHO_ARRAY = 10;
		
		int[] novoArray = new int[TAMANHO_ARRAY];
		
		for (int i = 0; i < novoArray.length; i++) {
			novoArray[i] = 2 + i * 2;
		}
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < novoArray.length; i++) {
			System.out.printf("%5d%8d%n", i, novoArray[i]);
			
		}
		
	}

}
