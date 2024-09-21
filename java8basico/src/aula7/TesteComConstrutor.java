package aula7;

import javax.swing.JOptionPane;

public class TesteComConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaComConstrutor conta1 = new ContaComConstrutor("Danny Phantom");
		ContaComConstrutor conta2 = new ContaComConstrutor("Vlad Plasmius");
		
		JOptionPane.showMessageDialog(null, "O nome da Conta1 é: " + conta1.getNome());
		JOptionPane.showMessageDialog(null, "O nome da Conta2 é: " + conta2.getNome());
		
	}

}
