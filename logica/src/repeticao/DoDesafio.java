package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		/*
		 * Missão 1
		 * Jogador1 vai digitar um número 
		 * Jogador2 vai ter que adivinhar o número 
		 * 
		 * Jogador2 só pode receber a mensagem de "parabens" quando ele acertar 
		 * 
		 * Missão 2
		 * Acrescentar dicas para o Jogador2 (numero maior ou menor)
		 * 
		 * Missão 3
		 * Acrescentar na mensagem de parabéns a quantidade de tentativas 
		 * Dica: criar uma variável para contar
		 */
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		int chute=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe um valor"));
		}while(valor!=chute);
		
		
		System.out.println("Parabens");
	}

}
