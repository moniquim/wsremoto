package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		/*
		 * Miss�o 1
		 * Jogador1 vai digitar um n�mero 
		 * Jogador2 vai ter que adivinhar o n�mero 
		 * 
		 * Jogador2 s� pode receber a mensagem de "parabens" quando ele acertar 
		 * 
		 * Miss�o 2
		 * Acrescentar dicas para o Jogador2 (numero maior ou menor)
		 * 
		 * Miss�o 3
		 * Acrescentar na mensagem de parab�ns a quantidade de tentativas 
		 * Dica: criar uma vari�vel para contar
		 */
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		int chute=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe um valor"));
		}while(valor!=chute);
		
		
		System.out.println("Parabens");
	}

}
