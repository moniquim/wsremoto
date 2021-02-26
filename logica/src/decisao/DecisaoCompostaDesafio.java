package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaDesafio {

	public static void main(String[] args) {
		/*
		 * Capture dois times e os seus respectivos placares: 
		 * exiba, 
		 * "Time 1 venceu"
		 * "Time 2 venceu"
		 * ou
		 * "Houve empate"
		 * 
		 */

		String casa = JOptionPane.showInputDialog("Time da casa").toUpperCase();	
		String visitante = JOptionPane.showInputDialog("Time visitante").toUpperCase();
		byte golscasa = Byte.parseByte(JOptionPane.showInputDialog("gols casa"));
		byte golsvisitante = Byte.parseByte(JOptionPane.showInputDialog("gols visitante"));
		
		if (golscasa==golsvisitante) {
			System.out.println("houve um empate");
		}else if (golscasa>golsvisitante) {
			System.out.println("venceu o time: " + casa);
		}else {
			System.out.println("venceu o time: " + visitante);
		}
	
	}

}
