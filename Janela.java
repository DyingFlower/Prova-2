package Penaltis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
	private JPanel painel;
	public Janela (JPanel painel) {
		setSize(600,800);
		setLayout(new BorderLayout());
		this.painel=painel;
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
