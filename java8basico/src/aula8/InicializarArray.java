package aula8;

public class InicializarArray {

	public static void main(String[] args) {
		//Declara a array e inicializa com o objeto array
		int[] array = new int[10];   //Cria o objeto array
		
		//Saída
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		//Gera a saída de cada elemento do array
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
			
		}

	}

}   //Fim da classe "InicializarArray"
