package aula8;

public class PesquisaDosAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		
		int[] frequencia = new int[6];
		
		for (int resp = 0; resp < respostas.length; resp++) {
			try {
				//Este bloco pode ter erros
				++frequencia[respostas[resp]];
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf("   Respostas[%d] = %d\n\n", resp, respostas[resp]);
				
			}
			
		}
		
		System.out.printf("%s%12s%n", "Conceito", "Frequencia");
		
		for(int nota = 1; nota < frequencia.length; nota++) {
			System.out.printf("%6d%10d\n", nota, frequencia[nota]);
		}

	}

}
