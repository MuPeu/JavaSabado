package aula3;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {
		//Variáveis
				int idade = 19;
				
				//Processamento
				if (idade >= 18) {
					System.out.println("Você é maior de idade!");
					System.out.println("Esse texto está dentro do bloco do if");
				}
				else {
					System.out.println("Você não é maior de idade!");
					System.out.println("Esse texto está dentro do bloco do else");
				}
				System.out.println("\nEsse texto está fora do bloco do if e do else");
	}

}
