package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio {

	public static void main(String[] args) {
	/*
	 * Capturar:
	 * nome do produto
	 * genero do produto (alimenticio, eletronico, etc...)
	 * quantidade
	 * valor unitario 
	 * voc� dever� calcular o imposto sobre o valor unit�rio
	 * se for alimenticio, o imposto ser� de 5%
	 * se for eletronico, o imposto ser� de 7%
	 * se a qntd for maior que 100, o imposto ser� menor em 1%
	 * se a qntd estiver entre 50 e 100 o imposto ser� menor em 0,5%
	 * se a qntd for menor que 50 o imposto ser� integral 
	 * 
	 * exibir o valor unit�rio ja com o imposto
	 * 
	 * 
	 */
		
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		String genero = JOptionPane.showInputDialog("Genero").toUpperCase();
		int qntd =Integer.parseInt(JOptionPane.showInputDialog("Qntd"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float taxa=0;
		if (genero.equals("Alimenticio")) {
			if (qntd>100) {
			taxa = (float) 0.04;
	
		}else if (qntd<50 ) {
			taxa = (float) 0.05;
			
		}else{
			taxa = (float) 0.045;
		}
			
		}else if (genero.equals("Eletronico")) {
			if (qntd>100) {
				taxa = (float) 0.06;
		}else if (qntd<50) {
				taxa = (float) 0.07;	
		}else {
		}		taxa = (float) 0.065;
		
		}else {
			System.out.println("Categoria inv�lida");
			
		}
		System.out.println("Valor com imposto: " + (valorUnitario + valorUnitario * taxa));
		
		
		
		
	}




String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
String genero = JOptionPane.showInputDialog("Genero").toUpperCase();
int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
float taxa=0 
if (genero.equals("ALIMENTICIO")) {
	if (qtde>100) {
		taxa = (float) 0.04;
	}else if (qtde<50) {
		taxa = (float) 0.05;
	}else {
		taxa = (float) 0.045;
	}
}else if (genero.equals("ELETRONICO")) {
	if (qtde>100) {
		taxa = (float) 0.06;
	}else if (qtde<50) {
		taxa = (float) 0.07;
	}else {
		taxa = (float) 0.065;
	}
}else {
	System.out.println("Categoria inv�lida.");
}

System.out.println("Valor com imposto: " + (valorUnitario + valorUnitario * taxa)); 
}
}
		//Exerc�cio 1
	
public static void main(String[] args) {
	int A
	int B
	int adi��o
	int subtra��o
	int multiplica��o
	int divis�o
	
	
	
	
	
	
	
	
}


	
	
	
	
	
	



