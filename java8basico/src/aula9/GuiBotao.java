package aula9;

import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiBotao extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton btnMensagem, btnTeimoso;
	private ImageIcon imageIcon1;
	
	public GuiBotao() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		imageIcon1 = new ImageIcon("C://Users//FIC//img/java1.jpg");
		btnMensagem = new JButton("Menssagem", imageIcon1);
		btnMensagem.setBounds(50, 20, 140, 38);
		btnMensagem.setMnemonic(KeyEvent.VK_M);
		btnMensagem.setToolTipText("Clique aqui para ver a mensagem!");
		btnTeimoso = new JButton ("Teimoso");
		btnTeimoso.setBounds(50, 70, 100, 25);
		add(btnMensagem);
		add(btnTeimoso);
	}
	
	private void definirEventos() {
		btnMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botão Mensagem");
			}
		});
		
		btnTeimoso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botão Teimoso");
			}
		});
		
		btnTeimoso.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {};
			public void mousePressed(MouseEvent e) {};
			public void mouseReleased(MouseEvent e) {};
			public void mouseEntered(MouseEvent e) {
				btnTeimoso.setBounds(50, 120, 100, 25);
			};
			public void mouseExited(MouseEvent e) {
				btnTeimoso.setBounds(50, 70, 100, 25);
			};
		});
		
	}

}
