package aula6;

public class ConvercaoParaString {

	public static void main(String[] args) {
		int a = 1000;
		long b = 2900;
		float c = 1111;
		double d = 4567;
		
		String texto = String.valueOf(a) + ", " + String.valueOf(b) + ", " + String.valueOf(c) + " e " + String.valueOf(d);
		System.out.println("O texto é: " + texto);

	}

}
