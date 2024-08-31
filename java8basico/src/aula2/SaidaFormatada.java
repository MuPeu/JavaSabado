package aula2;

public class SaidaFormatada {
	
	public static void main(String[] args) {
		//Descrição de variaveis
		float nota = 9.6f;   //definir e inicializar a variável
		String nome = "Murilo"; //definir a variável string
		String alien = "Mestre Yoda";
		
		//Processamento e Saida
		System.out.println("Sua nota é " + nota);   //concatenar = juntar
		
		//Um outro jeito de saida
		System.out.print("Sua nota é " + nota);
		System.out.println();
		
		//Um exemplo de saida formatada
		System.out.printf("A sua nota é %.2f \n", nota);
		
		//Mais um jeito de saida
		System.out.format("Saiba que sua nota é %.2f \n", nota);
		
		//Personalizando a saida
		System.out.printf("A nota de %s é %.2f \n", nome, nota);
		
	}

}
