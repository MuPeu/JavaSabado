package aula6;

public class DiversosMetodos {

	public static void main(String[] args) {
		//Definir variaveis
		double a = 2.4, b = 2.8, c = 4, d = -1, e = 2.5;
		
		//Processamento
		System.out.println("Arredondamento de " + a + " = " + Math.round(a));
		System.out.println("Arredondamento de " + b + " = " + Math.round(b));
		System.out.println("Arredondamento de " + e + " = " + Math.round(e));
		System.out.println("Maior valor entre: " + a + " e " + b + " = " + Math.max(a, b));
		System.out.println("Maior valor entre: " + a + " e " + b + " = " + Math.min(a, b));
		System.out.println("O quadrado de " + c + " = " + Math.pow(c, 2));
		System.out.println("A raiz quadrada de " + c + " = " + Math.sqrt(c));
		System.out.println("O valor absoluto de " + d + " = " + Math.abs(d));

	}

}
