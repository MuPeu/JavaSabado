package aula8;

public class TesteForMelhorado {

	public static void main(String[] args) {
		int[] array = {62, 68, 94, 100, 83, 76, 85, 91, 76};
		int total = 0;
		
		for(int i : array) {
			total += i;
		}
		
		System.out.printf("Total dos elementos do array: %d", total);

	}

}
