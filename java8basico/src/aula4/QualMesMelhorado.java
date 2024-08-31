package aula4;

import java.util.Scanner;

public class QualMesMelhorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número do mês: ");
		mes = teclado.nextInt();
		
		if(mes == 1)
			System.out.println("\nO mês é Janeiro!");
		else if(mes == 2) 
			System.out.println("\nO mês é Feveiro!");
		else if(mes == 3) 
			System.out.println("\nO mês é Março!");
		else if(mes == 4)
			System.out.println("\nO mês é Abril!");
		else if(mes == 5)
			System.out.println("\nO mês é Maio!");
		else if(mes == 6)
			System.out.println("\nO mês é Junho!");
		else if(mes == 7)
			System.out.println("\nO mês é Julho!");
		else if(mes == 8)
			System.out.println("\nO mês é Agosto!");
		else if(mes == 9)
			System.out.println("\nO mês é Setembro!");
		else if(mes == 10)
			System.out.println("\nO mês é Outubro!");
		else if(mes == 11)
			System.out.println("\nO mês é Novembro!");
		else if(mes == 12)
			System.out.println("\nO mês é Dezembro!");
		else
			System.out.println("\nO mês não existe!");
		
		teclado.close();
	}

}
