package aula7;

import javax.swing.JOptionPane;

public class OperacaoBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta destino = new Conta();
		Conta origem = new Conta();
		
		destino.setTitular(JOptionPane.showInputDialog("Digite o nome do destinatario:"));
		
		destino.setSNumero(JOptionPane.showInputDialog("Digite o número da conta do destinatario:"));
		destino.setNumero(Integer.parseInt(destino.getSNumero()));
		
		destino.setSSaldo(JOptionPane.showInputDialog("Digite o saldo da conta do destinatario:"));
		destino.setSaldo(Double.parseDouble(destino.getSSaldo()));
		
		destino.setSLimite(JOptionPane.showInputDialog("Digite o limite do destinatario:"));
		destino.setLimite(Double.parseDouble(destino.getSLimite()));
		
		JOptionPane.showMessageDialog(null, "O saldo da conta de " + destino.getTitular() + ", é de: " + destino.getSaldo());
		
		origem.setTitular(JOptionPane.showInputDialog("Digite o seu nome:"));
		
		origem.setSNumero(JOptionPane.showInputDialog("Digite o número da sua conta:"));
		origem.setNumero(Integer.parseInt(origem.getSNumero()));
		
		origem.setSSaldo(JOptionPane.showInputDialog("Digite o saldo da sua conta:"));
		origem.setSaldo(Double.parseDouble(origem.getSSaldo()));
		
		origem.setSLimite(JOptionPane.showInputDialog("Digite o seu limite:"));
		origem.setLimite(Double.parseDouble(origem.getSLimite()));
		
		origem.setSValor(JOptionPane.showInputDialog("Quanto você quer depositar?"));
		origem.setValor(Double.parseDouble(origem.getSValor()));
		
		origem.transfere(destino, origem.getValor());
		
		if (origem.getAprovado()) {
		JOptionPane.showMessageDialog(null, "O saldo da conta de " + origem.getTitular() + ", agora é de " + origem.getSaldo());
		JOptionPane.showMessageDialog(null, "O saldo da conta de " + destino.getTitular() + ", ficou com " + destino.getSaldo());
		}

	}

}
