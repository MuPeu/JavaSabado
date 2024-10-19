package aula9;

import javax.swing.JOptionPane;

public class Adicao {

	public static void main(String[] args) {
		String primeiroNumero = JOptionPane.showInputDialog("Entre o primeiro inteiro:");
		String segundoNumero = JOptionPane.showInputDialog("Entre o segundo inteiro:");
		
		int numero1 = Integer.parseInt(primeiroNumero);
		int numero2 = Integer.parseInt(segundoNumero);
		
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma é: " + soma, "Soma de Dois Inteiros", JOptionPane.INFORMATION_MESSAGE);

	}

}
