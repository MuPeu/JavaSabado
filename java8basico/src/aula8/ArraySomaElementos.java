package aula8;

public class ArraySomaElementos {

	public static void main(String[] args) {
		int[] arrayUm = {65, 54, 84, 77, 23, 90, 12, 42, 36};
		
		int total = 0;
		
		for (int i = 0; i < arrayUm.length; i++) {
			total += arrayUm[i];
			
		}
		
		System.out.printf("Total dos elementos do array: %d\n", total);

	}

}
