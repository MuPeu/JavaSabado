package aula4;

public class DesafioDaTarde {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i < 60 && i > 50)
				continue;
			System.out.println(i);
		}

	}

}