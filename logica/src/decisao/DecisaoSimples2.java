package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		/*
		 * Capturem:
		 * - nome da disciplina 
		 * - duas notas
		 * - calcular a media 
		 * - exibir a media 
		 * - exibir a mensagem "Parab�ns" somente se a media for maior ou igual a 6
		 * 
		 * 
		 */
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1 + nota2)/2;
		if (media>=6) {
			System.out.println("Parab�ns voc� est� aprovado na disciplina: " + disciplina);
			
	}
		if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado!!!");
		}
		if (media<6 && media>=4) {
			System.out.println("Voc� ainda tem chance no exame");
		}
             System.out.println("Sua m�dia foi: " + media);
	}
	
}