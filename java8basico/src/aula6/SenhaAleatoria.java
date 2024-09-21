package aula6;

public class SenhaAleatoria {

	public static void main(String[] args) {
		String senha = "";   //Cria a váriavel senha
		
		//Processamento
		for (int i = 1; i <= 10; i++) {
			int num = (int) (Math.random() * 10);   //Gerando um número aleatorio, de 0 até 10
			senha += num;
		}
		
		//Saída
		System.out.printf("A senha gerada é: %s", senha);
		System.out.println("\nBoa sorte!");
		
	}

}
