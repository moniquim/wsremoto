package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		/*
		 * Capturar nome e idade
		 * Requisitos para no final exibir o nome e a idade:
		 * - nome deve possuir no m�nimo 5 caracteres 
		 * - nome deve possuir no m�ximo 15 caracteres
		 * - nome deve possuir um "espa�o"
		 * - idade deve estar entre 18 e 70 anos
		 * 
		 * 
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		while(nome.contains(" ")==false || nome.length()<5 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
		}
		while(idade>18 || idade>=70) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade novamente")); 
	}
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		
		
		
	}

}
