package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		double altura =
				Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso =
				Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos ");
		System.out.println("Altura: " + altura + "m");
		System.out.println("IMC...: " + imc);
		
		
		
		
		// Pe�am o peso
		// Criar uma variavel chamada IMC (fazer calculo)
		// Exibir IMC
		
		/* 
		 * Alfanum�rico: � um dado que voc� n�o utiliza em opera�oes aritm�ticas. 
		 * CEP: 00010-009 => 00010-009
		 * String representa um dado alfanum�rico no Java
		 * 
		 * Num�rico: � o dado que pode ser utilizado em opera��es aritm�ticas.
		 * CEP: 00010-009 => 1
		 * Dois tipos:
		 * - Inteiro em Java � int
		 * - Real em Java � double
		 * 
		 * N�mero n�o precisa usar aspas
		 * Altura � ponto e n�o v�rgula 
		 * 
		 * 
		*/ 
		
		
		
		
		
		
		
	}
}
