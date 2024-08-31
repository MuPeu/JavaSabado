package aula4;

import java.util.Scanner;

public class QualMesComSwitchEString {

	public static void main(String[] args) {
		//Declaração
		String mes;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Digite o número do mês: ");
		mes = teclado.nextLine();
		System.out.println();
		
		switch (mes) {
		case  	"um": System.out.println("Janeiro"); 		break;
		case  	"dois": System.out.println("Fevereiro"); 	break;
		case  	"tres": System.out.println("Março"); 		break;
		case  	"quatro": System.out.println("Abril"); 		break;
		case  	"cinco": System.out.println("Maio"); 		break;
		case  	"seis": System.out.println("Junho");	 	break;
		case  	"sete": System.out.println("Julho"); 		break;
		case  	"oito": System.out.println("Agosto"); 		break;
		case  	"nove": System.out.println("Setembro"); 	break;
		case	"dez": System.out.println("Outubro"); 		break;
		case	"onse": System.out.println("Novembro"); 	break;
		case	"dose": System.out.println("Desembro"); 	break;
		default: System.out.println(); 						break;
		}

		teclado.close();
		
	}

}
