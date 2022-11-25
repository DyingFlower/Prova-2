package Penaltis;
import javax.swing.JLabel;
public class Label extends JLabel {
	String texto;
	public Label(String texto) {
		this.texto=texto;
		setText(texto);
		setVisible(true);
	}
}
