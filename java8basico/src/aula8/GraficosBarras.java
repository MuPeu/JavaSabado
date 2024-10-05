package aula8;

public class GraficosBarras {

	public static void main(String[] args) {
		int[] arrayFrequencias = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.println("Distribuição das Notas");
		
		for (int i = 0; i < arrayFrequencias.length; i++) {
			if (i == 10) {
				System.out.printf("\n%5d: ", 100);
			}
			else {
				System.out.printf("\n%02d-%02d: ", i * 10, i * 10 + 9);
			}
			
			for (int estrelas = 0; estrelas < arrayFrequencias[i]; estrelas++) {
				System.out.print("*");
				
			}
			
		}
		
		System.out.print("\n\nLista --->");

	}

}