package aula7;

import javax.swing.JOptionPane;

public class UmNovoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta outraconta = new Conta();
		
		outraconta.setSSaldo(JOptionPane.showInputDialog("Digite o saldo da conta:"));
		outraconta.setSaldo(Double.parseDouble(outraconta.getSSaldo()));
		
		String sNovoSaldo = JOptionPane.showInputDialog("Digite o saldo da conta:");
		double novoSaldo = Double.parseDouble(sNovoSaldo);
		
		if (novoSaldo < 0) {
			JOptionPane.showMessageDialog(null, "Não é possível efetuar essa transação");
		}
		else {
			outraconta.setSaldo(novoSaldo);
		}
		
		JOptionPane.showMessageDialog(null, "O saldo da conta é" + outraconta.getSaldo());
		
	}

}
