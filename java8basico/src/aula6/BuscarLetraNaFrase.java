package aula6;

public class BuscarLetraNaFrase {

	public static void main(String[] args) {
		String frase = "Livro Java 8 - Como Programar?";
		char letra = 'a';
		
		System.out.println("Frase: " + frase);
		System.out.println("\nIndices: " + frase.indexOf(letra) + ", " + frase.indexOf(letra, 12));
		System.out.println("Indice: " + frase.indexOf("Java"));
		System.out.println("Indice: " + frase.indexOf("Java", 12));

	}

}
