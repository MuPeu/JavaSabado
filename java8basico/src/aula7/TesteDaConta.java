package aula7;

import javax.swing.JOptionPane;

public class TesteDaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.setTitular(JOptionPane.showInputDialog("Digite o seu nome:"));
		
		minhaConta.setSNumero(JOptionPane.showInputDialog("Digite o número da sua conta:"));
		minhaConta.setNumero(Integer.parseInt(minhaConta.getSNumero()));
		
		minhaConta.setSSaldo(JOptionPane.showInputDialog("Digite o seu saldo:"));
		minhaConta.setSaldo(Double.parseDouble(minhaConta.getSSaldo()));
		
		minhaConta.setSLimite(JOptionPane.showInputDialog("Digite o limite para gastar:"));
		minhaConta.setLimite(Double.parseDouble(minhaConta.getSLimite()));
		
		JOptionPane.showMessageDialog(null, "O saldo da conta é: " + minhaConta.getSaldo());
		
		minhaConta.setSQuantidade(JOptionPane.showInputDialog("Quanto você quer sacar?"));
		minhaConta.setQuantidade(Double.parseDouble(minhaConta.getSQuantidade()));
		minhaConta.saca(minhaConta.getQuantidade());
		
		minhaConta.setSQuantidade(JOptionPane.showInputDialog("Quanto você quer depositar?"));
		minhaConta.setQuantidade(Double.parseDouble(minhaConta.getSQuantidade()));
		minhaConta.deposito(minhaConta.getQuantidade());
		
		JOptionPane.showMessageDialog(null, "Depois das operações, o saldo da conta é: " + minhaConta.getSaldo());
		
	}

}
