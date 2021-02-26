package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		/*
		 * Capturar a qntd de faltas
		 * Para que ele esteja aprovado ou de exame, ele também precisa que a qntd de faltas seja menor que 20
		 *  
		 *  
		 */
		
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas"));
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		if (faltas>=20) {
			System.out.println("você está reprovado por faltas.");
		}else {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1 + nota2)/2;
		if (media>=6 && faltas<20) {
			System.out.println("Parabens você está aprovado na disciplina: " + disciplina);
			
		}else if (media<4 || faltas<20) {
			System.out.println("infelizmente você está reprovado!!!")
			;
		}else {
			System.out.println("você ainda tem chance no exame");
		}
		System.out.println("sua media foi: " + media);
		}
}
}

