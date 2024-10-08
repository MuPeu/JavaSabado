package aula7;

import javax.swing.JOptionPane;

public class Conta {
	private int numero;
	private String titular, sNumero, sSaldo, sLimite, sQuantidade, sValor;
	private double saldo, limite, quantidade, valor;
	private boolean aprovado;
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getSNumero() {
		return this.sNumero;
	}
	
	public void setSNumero(String sNumero) {
		this.sNumero = sNumero;
	}
	
	public String getSSaldo() {
		return this.sSaldo;
	}
	
	public void setSSaldo(String sSaldo) {
		this.sSaldo = sSaldo;
	}
	
	public String getSLimite() {
		return this.sLimite;
	}
	
	public void setSLimite(String sLimite) {
		this.sLimite = sLimite;
	}
	
	public String getSQuantidade() {
		return this.sQuantidade;
	}
	
	public void setSQuantidade(String sQuantidade) {
		this.sQuantidade = sQuantidade;
	}
	
	public String getSValor() {
		return this.sValor;
	}
	
	public void setSValor(String sValor) {
		this.sValor = sValor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean getAprovado() {
		return this.aprovado;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public boolean saca(double quantidade){
		if (this.saldo < quantidade) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
			return false;
		}
		
		else{
			saldo -= quantidade;
			return true;
		}

	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
		
	}
	
	public boolean transfere(Conta destino, double valor) {
		boolean saqueOK = this.saca(valor);
		if (saqueOK == false){
			JOptionPane.showMessageDialog(null, "Transferência não realizada");
			aprovado = false;
			return false;
			
		}
		else {
			if (valor < 0) {
				JOptionPane.showMessageDialog(null, "O valor à ser tranferir é inválido");
				aprovado = false;
			}
			else if (valor > this.saldo) {
				JOptionPane.showMessageDialog(null, "O valor à ser transferido utrapassa o seu saldo.\nO valor é inválido");
				aprovado = false;
			}
			else if (valor > this.limite) {
				JOptionPane.showMessageDialog(null, "O limite da conta foi atingido");
				aprovado = false;
			}
			else {
				this.saldo -= valor;
				destino.deposito(valor);
				aprovado = true;
			}
			
			return true;
		
		}
	}
	
}
