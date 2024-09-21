package aula6;

public class JogoDeAzar {

	public static void main(String[] args) {
		//Processamento
		for (int jogo = 1; jogo <= 6; jogo++) {
			String bilhete = "";
			for (int numCartao = 1; numCartao <= 6; numCartao++) {
				int ngerado = (int) (Math.random() * 60);
				bilhete += ngerado + ", ";
			}
			System.out.println("Os números do cartão " + jogo + " são: " + bilhete);
		}

	}

}
