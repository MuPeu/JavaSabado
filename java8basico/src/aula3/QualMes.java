package aula3;

import java.util.Scanner;

public class QualMes {

	public static void main(String[] args) {
		//Variável
		int dig, mesnum;
		String mesname;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 1 para digitar o número do mês, e 2 para digitar o nome do mês.");
		dig = teclado.nextInt();
		
		switch (dig){
			case 1:
				System.out.print("Digite o número do mês: ");
				mesnum = teclado.nextInt();
				
				if(mesnum == 1) 
					System.out.println("\nO mês é Janeiro!");
				else if(mesnum == 2) 
					System.out.println("\nO mês é Feveiro!");
				else if(mesnum == 3) 
					System.out.println("\nO mês é Março!");
				else if(mesnum == 4)
					System.out.println("\nO mês é Abril!");
				else if(mesnum == 5)
					System.out.println("\nO mês é Maio!");
				else if(mesnum == 6)
					System.out.println("\nO mês é Junho!");
				else if(mesnum == 7)
					System.out.println("\nO mês é Julho!");
				else if(mesnum == 8)
					System.out.println("\nO mês é Agosto!");
				else if(mesnum == 9)
					System.out.println("\nO mês é Setembro!");
				else if(mesnum == 10)
					System.out.println("\nO mês é Outubro!");
				else if(mesnum == 11)
					System.out.println("\nO mês é Novembro!");
				else if(mesnum == 12)
					System.out.println("\nO mês é Dezembro!");
				else
					System.out.println("Mês não existe!");
			break;

			case 2:
				System.out.print("Digite o nome do mês: ");
				mesname = teclado.nextLine();
				mesname.toUpperCase();
				
				if(mesname == ("JANEIRO"))
					System.out.println("\nJaneiro é o mês 1!");
				else if(mesname.equals("FEVEREIRO"))
					System.out.println("\nFeveiro é o mês 2!");
				else if(mesname.equals("Março") || mesname.equals("março"))
					System.out.println("\nFeveiro é o mês 3!");
				else if(mesname.equals("Abril") || mesname.equals("abril"))
					System.out.println("\nAbril é o mês 4!");
				else if(mesname.equals("Maio") || mesname.equals("maio"))
					System.out.println("\nMaio é o mês 5!");
				else if(mesname == "Junho" || mesname == "junho")
					System.out.println("\nJunho é o mês 6!");
				else if(mesname == "Julho" || mesname == "julho")
					System.out.println("\nJulho é o mês 7!");
				else if(mesname == "Agosto" || mesname == "agosto")
					System.out.println("\nAgosto é o mês 8!");
				else if(mesname == "Setembro" || mesname == "setembro")
					System.out.println("\nSetembro é o mês 9!");
				else if(mesname == "Outubro" || mesname == "outubro")
					System.out.println("\nOutubro é o mês 10!");
				else if(mesname == "Novembro" || mesname == "novembro")
					System.out.println("\nNovembro é o mês 11!");
				else if(mesname == "Dezembro" || mesname == "dezembro")
					System.out.println("\nDezembro é o mês 12!");
				else
					System.out.println("\nMês não existe!");
			break;
		}
		teclado.close();
	}

}
