package aula4;

public class Relogio {

	public static void main(String[] args) {
		//Variáveis
		int horas, minutos, segundos;
		
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.printf("%d horas, %d minutos, e %d segundos!\n", horas, minutos, segundos);
				}
				if (minutos == 15)
					System.exit(0);
			}
		}
		
	}

}
