package aula8;

import javax.swing.JOptionPane;

public class ArraySoma {

	public static void main(String[] args) {
		int[] c = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do indíce:"))];
		
		c[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		for (int i = 2; i < c.length; i++) {
			c[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
			
		}
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%5d%8d%n", i, c[i]);
			
		}
		
		int soma = c[1] + c[2] + c[3];
		
		System.out.printf("s\nA soma dos 3 primeiros número é: %d", soma);

	}

}