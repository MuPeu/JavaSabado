package aula7;

import javax.swing.JOptionPane;

public class NovoTesteDaContaDefinitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaDefinitiva minhaConta = new ContaDefinitiva();
		
		JOptionPane.showMessageDialog(null, "Nome inicial é: " + minhaConta.getNome());
		
		minhaConta.setNome(JOptionPane.showInputDialog("Por favor entre com o nome da Conta:"));
		
		JOptionPane.showMessageDialog(null, "O novo nome é: " + minhaConta.getNome());
		
	}

}
