package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		/*
		 * For: proprio para situa��es onde n�o h� intera��o com o usu�rio final 
		 * Sintaxe:
		 * - definir o contador 
		 * - condi��o
		 * - como ele vai contar 	
		 * 
		 * 
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		// 7 x 1 = 7
		// 7 x 2 = 14 (....)
		for(int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
	}

}
