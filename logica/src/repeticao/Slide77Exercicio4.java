package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 */
		String nome="";
		short idade=0;
		do {
			nome = JOptionPane.showInputDialog("nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		}while(JOptionPane.showConfirmDialog(null, "continuar?", "T�tulo", JOptionPane.YES_NO_OPTION)==0);
			
	}

}
