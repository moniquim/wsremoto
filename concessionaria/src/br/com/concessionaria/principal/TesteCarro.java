package br.com.concessionaria.principal;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando um objeto
		Carro objeto = new Carro();
		objeto.preencherCor("azul");
		System.out.println(objeto.retornarCor());
		
		objeto.ligar();
		objeto.acelerar((short)20);
		objeto.acelerar((short)30);
		System.out.println(objeto.retornarResumo());
		objeto.brecar((short)100);
		objeto.desligar();
		objeto.acelerar((short)50);
		System.out.println(objeto.retornarResumo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
