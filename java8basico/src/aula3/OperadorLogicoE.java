package aula3;

public class OperadorLogicoE {

	public static void main(String[] args) {
		//Condição de aprovação do empréstimo 
		//Salario maior que 1000 reais
		//Idade maior que 18 anos
		
		int salario = 900;
		int idade = 19;
		String res;

		boolean aprovacao = (salario > 1000) && (idade > 18);
		res = (salario > 1000 && idade > 18)? "Aprovado" : "Reprovado";

		System.out.println(aprovacao);
		System.out.println(res);

	}

}
