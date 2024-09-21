package aula6;

import java.text.DecimalFormat;
import java.util.Locale;

public class ConfiguracoesRegionais {

	public static void main(String[] args) {
		//Váriaveis
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1350.76;
		
		if(local.getCountry().equals("BR")) {
			df.applyPattern("R$ #,##0.00");
		}
		
		//Saída
		System.out.println("Configurações do Sistema Operácional:");
		System.out.println("\nSigla: " + local.getCountry());
		System.out.println("\nPaís: " + local.getDisplayCountry());
		System.out.println("\nLíngua: " + local.getDisplayLanguage());
		System.out.println("\nTeclado: " + local.getDisplayName());
		System.out.println("\nValor: " + df.format(valor));
		

	}

}
