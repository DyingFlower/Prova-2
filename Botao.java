package Penaltis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Botao implements ActionListener{
	Gol gol;
	int contador;
	private String contadorg;
	String valort="Trave";
	String valorf="Fora";
	public Botao(Gol gol, JLabel label) {
		this.gol = gol;
	}
	public JButton CriarBotoes(String nomebotao) {
		JButton botao = new JButton();
		botao.setText(nomebotao);
		botao.addActionListener(this);
		return botao;
		
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.getText().equals(valort)|| b.getText().equals("Bola na Trave")) {
			b.setText("Bola na Trave");
			contador=+1;
		}
		else if(b.getText().equals(valorf)|| b.getText().equals("Bola Fora")) {
			b.setText("Bola Fora");
			contador=+1;
		}
		else {
			b.setText("Chute");
			contador=+1;
		}
		setContadorg(""+contador);
		
		
	}
	public String getContadorg() {
		return contadorg;
	}
	public void setContadorg(String contadorg) {
		this.contadorg = contadorg;
	}
}
